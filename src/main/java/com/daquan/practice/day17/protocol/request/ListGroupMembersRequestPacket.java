package com.daquan.practice.day17.protocol.request;

import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;

import static com.daquan.practice.day17.protocol.command.Command.LIST_GROUP_MEMBERS_REQUEST;

@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_REQUEST;
    }
}
