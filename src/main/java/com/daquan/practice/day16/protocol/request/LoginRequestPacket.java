package com.daquan.practice.day16.protocol.request;

import com.daquan.practice.day16.protocol.Packet;
import com.daquan.practice.day16.protocol.command.Command;
import lombok.Data;

@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return Command.LOGIN_REQUEST;
    }
}
