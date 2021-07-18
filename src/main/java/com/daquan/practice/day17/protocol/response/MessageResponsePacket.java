package com.daquan.practice.day17.protocol.response;

import com.daquan.practice.day17.protocol.command.Command;
import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return Command.MESSAGE_RESPONSE;
    }
}
