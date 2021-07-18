package com.daquan.practice.day18.protocol.request;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import lombok.Data;

import java.util.List;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return Command.CREATE_GROUP_REQUEST;
    }
}
