package com.daquan.practice.day17.protocol.response;

import com.daquan.practice.day17.protocol.command.Command;
import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return Command.QUIT_GROUP_RESPONSE;
    }
}
