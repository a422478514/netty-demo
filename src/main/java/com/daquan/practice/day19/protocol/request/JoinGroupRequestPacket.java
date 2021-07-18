package com.daquan.practice.day19.protocol.request;

import lombok.Data;
import com.daquan.practice.day19.protocol.Packet;

import static com.daquan.practice.day19.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
