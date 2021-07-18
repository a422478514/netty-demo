package com.daquan.practice.day16.protocol.request;

import lombok.Data;
import com.daquan.practice.day16.protocol.Packet;

import static com.daquan.practice.day16.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
