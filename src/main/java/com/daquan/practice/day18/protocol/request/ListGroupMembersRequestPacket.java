package com.daquan.practice.day18.protocol.request;

import com.daquan.practice.day18.protocol.Packet;
import com.daquan.practice.day18.protocol.command.Command;
import lombok.Data;

@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return Command.LIST_GROUP_MEMBERS_REQUEST;
    }
}
