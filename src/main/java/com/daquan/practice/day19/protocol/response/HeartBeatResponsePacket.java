package com.daquan.practice.day19.protocol.response;

import com.daquan.practice.day19.protocol.command.Command;
import com.daquan.practice.day19.protocol.Packet;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_RESPONSE;
    }
}
