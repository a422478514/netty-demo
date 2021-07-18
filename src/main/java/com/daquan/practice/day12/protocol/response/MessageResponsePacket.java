package com.daquan.practice.day12.protocol.response;

import com.daquan.practice.day09.protocol.command.Command;
import com.daquan.practice.day12.protocol.Packet;
import lombok.Data;


@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {

        return Command.MESSAGE_RESPONSE;
    }
}
