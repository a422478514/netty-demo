package com.daquan.practice.day16.protocol.request;

import lombok.Data;
import com.daquan.practice.day16.protocol.Packet;

import java.util.List;

import static com.daquan.practice.day16.protocol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
