package com.daquan.practice.day10.protocol.response;

import com.daquan.practice.day10.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.LOGIN_RESPONSE;


@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
