package com.daquan.practice.day08.request;

import com.daquan.practice.day08.Packet;
import lombok.Data;

import static com.daquan.practice.day08.command.Command.LOGIN_REQUEST;


@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
