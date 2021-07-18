package com.daquan.practice.day19.protocol.response;

import com.daquan.practice.day19.protocol.command.Command;
import lombok.Data;
import com.daquan.practice.day19.protocol.Packet;
import com.daquan.practice.day19.session.Session;

import java.util.List;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return Command.LIST_GROUP_MEMBERS_RESPONSE;
    }
}
