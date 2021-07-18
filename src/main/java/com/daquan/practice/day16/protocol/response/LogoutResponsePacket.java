package com.daquan.practice.day16.protocol.response;

import lombok.Data;
import com.daquan.practice.day16.protocol.Packet;

import static com.daquan.practice.day16.protocol.command.Command.LOGOUT_RESPONSE;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
