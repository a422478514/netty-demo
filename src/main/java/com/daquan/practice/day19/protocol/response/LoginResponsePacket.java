package com.daquan.practice.day19.protocol.response;

import com.daquan.practice.day19.protocol.Packet;
import com.daquan.practice.day19.protocol.command.Command;
import lombok.Data;

@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return Command.LOGIN_RESPONSE;
    }
}
