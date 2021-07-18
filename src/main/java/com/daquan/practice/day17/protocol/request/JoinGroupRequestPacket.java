package com.daquan.practice.day17.protocol.request;

import com.daquan.practice.day17.protocol.command.Command;
import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return Command.JOIN_GROUP_REQUEST;
    }
}
