package com.daquan.practice.day18.protocol.response;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import lombok.Data;

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
