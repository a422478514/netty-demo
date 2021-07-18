package com.daquan.practice.day18.protocol.response;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import com.daquan.practice.day18.session.Session;
import lombok.Data;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return Command.GROUP_MESSAGE_RESPONSE;
    }
}
