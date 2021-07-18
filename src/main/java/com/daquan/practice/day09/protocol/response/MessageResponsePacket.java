package com.daquan.practice.day09.protocol.response;

import com.daquan.practice.day09.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.MESSAGE_RESPONSE;


@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
