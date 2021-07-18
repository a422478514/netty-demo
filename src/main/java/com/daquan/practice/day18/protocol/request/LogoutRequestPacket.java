package com.daquan.practice.day18.protocol.request;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import lombok.Data;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return Command.LOGOUT_REQUEST;
    }
}
