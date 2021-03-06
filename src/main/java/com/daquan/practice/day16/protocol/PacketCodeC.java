package com.daquan.practice.day16.protocol;

import com.daquan.practice.day16.protocol.response.LogoutResponsePacket;
import io.netty.buffer.ByteBuf;
import com.daquan.practice.day16.protocol.request.CreateGroupRequestPacket;
import com.daquan.practice.day16.protocol.request.LoginRequestPacket;
import com.daquan.practice.day16.protocol.request.LogoutRequestPacket;
import com.daquan.practice.day16.protocol.request.MessageRequestPacket;
import com.daquan.practice.day16.protocol.response.CreateGroupResponsePacket;
import com.daquan.practice.day16.protocol.response.LoginResponsePacket;
import com.daquan.practice.day16.protocol.response.MessageResponsePacket;
import com.daquan.practice.day16.serialize.Serializer;
import com.daquan.practice.day16.serialize.impl.JSONSerializer;

import java.util.HashMap;
import java.util.Map;

import static com.daquan.practice.day16.protocol.command.Command.*;

public class PacketCodeC {

    public static final int MAGIC_NUMBER = 0x12345678;
    public static final PacketCodeC INSTANCE = new PacketCodeC();

    private final Map<Byte, Class<? extends Packet>> packetTypeMap;
    private final Map<Byte, Serializer> serializerMap;


    private PacketCodeC() {
        packetTypeMap = new HashMap<>();
        packetTypeMap.put(LOGIN_REQUEST, LoginRequestPacket.class);
        packetTypeMap.put(LOGIN_RESPONSE, LoginResponsePacket.class);
        packetTypeMap.put(MESSAGE_REQUEST, MessageRequestPacket.class);
        packetTypeMap.put(MESSAGE_RESPONSE, MessageResponsePacket.class);
        packetTypeMap.put(LOGOUT_REQUEST, LogoutRequestPacket.class);
        packetTypeMap.put(LOGOUT_RESPONSE, LogoutResponsePacket.class);
        packetTypeMap.put(CREATE_GROUP_REQUEST, CreateGroupRequestPacket.class);
        packetTypeMap.put(CREATE_GROUP_RESPONSE, CreateGroupResponsePacket.class);

        serializerMap = new HashMap<>();
        Serializer serializer = new JSONSerializer();
        serializerMap.put(serializer.getSerializerAlgorithm(), serializer);
    }

    public void encode(ByteBuf byteBuf, Packet packet) {
        // 1. ????????? java ??????
        byte[] bytes = Serializer.DEFAULT.serialize(packet);

        // 2. ??????????????????
        byteBuf.writeInt(MAGIC_NUMBER);
        byteBuf.writeByte(packet.getVersion());
        byteBuf.writeByte(Serializer.DEFAULT.getSerializerAlgorithm());
        byteBuf.writeByte(packet.getCommand());
        byteBuf.writeInt(bytes.length);
        byteBuf.writeBytes(bytes);
    }


    public Packet decode(ByteBuf byteBuf) {
        // ?????? magic number
        byteBuf.skipBytes(4);

        // ???????????????
        byteBuf.skipBytes(1);

        // ???????????????
        byte serializeAlgorithm = byteBuf.readByte();

        // ??????
        byte command = byteBuf.readByte();

        // ???????????????
        int length = byteBuf.readInt();

        byte[] bytes = new byte[length];
        byteBuf.readBytes(bytes);

        Class<? extends Packet> requestType = getRequestType(command);
        Serializer serializer = getSerializer(serializeAlgorithm);

        if (requestType != null && serializer != null) {
            return serializer.deserialize(requestType, bytes);
        }

        return null;
    }

    private Serializer getSerializer(byte serializeAlgorithm) {

        return serializerMap.get(serializeAlgorithm);
    }

    private Class<? extends Packet> getRequestType(byte command) {

        return packetTypeMap.get(command);
    }
}
