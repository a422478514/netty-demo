package com.daquan.practice.day16.protocol.response;

import lombok.Data;
import com.daquan.practice.day16.protocol.Packet;

import static com.daquan.practice.day16.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
