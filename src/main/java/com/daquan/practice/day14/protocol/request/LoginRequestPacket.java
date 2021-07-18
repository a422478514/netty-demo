package com.daquan.practice.day14.protocol.request;

import com.daquan.practice.day14.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.LOGIN_REQUEST;


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
