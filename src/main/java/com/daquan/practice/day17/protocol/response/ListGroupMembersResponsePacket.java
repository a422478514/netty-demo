package com.daquan.practice.day17.protocol.response;

import lombok.Data;
import com.daquan.practice.day17.protocol.Packet;
import com.daquan.practice.day17.session.Session;

import java.util.List;

import static com.daquan.practice.day17.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
