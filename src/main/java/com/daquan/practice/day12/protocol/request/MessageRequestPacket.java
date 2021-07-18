package com.daquan.practice.day12.protocol.request;

import com.daquan.practice.day09.protocol.command.Command;
import com.daquan.practice.day12.protocol.Packet;
import lombok.Data;


@Data
public class MessageRequestPacket extends Packet {

    private String message;

    public MessageRequestPacket(String message) {
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
