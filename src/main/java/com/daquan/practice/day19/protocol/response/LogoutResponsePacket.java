package com.daquan.practice.day19.protocol.response;

import com.daquan.practice.day19.protocol.Packet;
import com.daquan.practice.day19.protocol.command.Command;
import lombok.Data;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return Command.LOGOUT_RESPONSE;
    }
}
