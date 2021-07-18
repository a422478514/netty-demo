package com.daquan.practice.day15.protocol.response;

import com.daquan.practice.day15.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day09.protocol.command.Command.LOGIN_RESPONSE;


@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
