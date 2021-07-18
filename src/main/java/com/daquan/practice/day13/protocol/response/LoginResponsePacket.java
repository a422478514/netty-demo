package com.daquan.practice.day13.protocol.response;

import com.daquan.practice.day09.protocol.command.Command;
import com.daquan.practice.day13.protocol.Packet;
import lombok.Data;


@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }
}
