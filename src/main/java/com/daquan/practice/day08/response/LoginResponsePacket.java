package com.daquan.practice.day08.response;

import com.daquan.practice.day08.Packet;
import lombok.Data;

import static com.daquan.practice.day08.command.Command.LOGIN_RESPONSE;


@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
