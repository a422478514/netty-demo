package com.daquan.practice.day12.protocol.request;

import com.daquan.practice.day09.protocol.command.Command;
import com.daquan.practice.day12.protocol.Packet;
import lombok.Data;


@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {

        return Command.LOGIN_REQUEST;
    }
}
