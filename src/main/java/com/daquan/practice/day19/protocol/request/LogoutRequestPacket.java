package com.daquan.practice.day19.protocol.request;

import com.daquan.practice.day19.protocol.Packet;
import com.daquan.practice.day19.protocol.command.Command;
import lombok.Data;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return Command.LOGOUT_REQUEST;
    }
}
