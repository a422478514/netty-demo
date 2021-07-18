package com.daquan.practice.day19.protocol.response;

import com.daquan.practice.day19.protocol.Packet;
import com.daquan.practice.day19.protocol.command.Command;
import lombok.Data;

import java.util.List;

@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return Command.CREATE_GROUP_RESPONSE;
    }
}
