package com.daquan.practice.day15.protocol.request;

import com.daquan.practice.day15.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.MESSAGE_REQUEST;


@Data
public class MessageRequestPacket extends Packet {
    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
