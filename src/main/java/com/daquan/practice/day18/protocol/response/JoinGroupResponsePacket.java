package com.daquan.practice.day18.protocol.response;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import lombok.Data;

@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return Command.JOIN_GROUP_RESPONSE;
    }
}
