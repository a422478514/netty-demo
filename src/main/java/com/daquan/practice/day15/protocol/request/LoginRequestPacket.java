package com.daquan.practice.day15.protocol.request;

import com.daquan.practice.day15.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.LOGIN_REQUEST;


@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
