package com.daquan.practice.day16.protocol.response;

import lombok.Data;
import com.daquan.practice.day16.protocol.Packet;

import static com.daquan.practice.day16.protocol.command.Command.LOGIN_RESPONSE;

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
