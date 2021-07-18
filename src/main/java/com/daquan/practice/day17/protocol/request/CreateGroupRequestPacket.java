package com.daquan.practice.day17.protocol.request;

import com.daquan.practice.day17.protocol.command.Command;
import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

import java.util.List;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return Command.CREATE_GROUP_REQUEST;
    }
}
