package com.daquan.practice.day18.protocol.request;

import lombok.Data;
import com.daquan.practice.day18.protocol.Packet;

import static com.daquan.practice.day18.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
