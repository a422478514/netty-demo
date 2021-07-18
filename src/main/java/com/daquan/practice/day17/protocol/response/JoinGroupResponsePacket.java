package com.daquan.practice.day17.protocol.response;

import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

import static com.daquan.practice.day17.protocol.command.Command.JOIN_GROUP_RESPONSE;

@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
