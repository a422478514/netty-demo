package com.daquan.practice.day18.protocol.response;

import com.daquan.practice.day18.session.Session;
import lombok.Data;
import com.daquan.practice.day18.protocol.Packet;

import java.util.List;

import static com.daquan.practice.day18.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
