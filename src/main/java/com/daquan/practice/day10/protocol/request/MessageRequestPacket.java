package com.daquan.practice.day10.protocol.request;

import com.daquan.practice.day10.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.MESSAGE_REQUEST;


@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
