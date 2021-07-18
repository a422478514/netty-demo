package com.daquan.practice.day17.protocol.response;

import com.daquan.practice.day17.protocol.Packet;
import lombok.Data;

import static com.daquan.practice.day17.protocol.command.Command.JOIN_GROUP_BRODCAST_RESPONSE;


/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/18
 */
@Data
public class JoinGroupBroadcastResponsePacket extends Packet {

    private String userId;

    private String userName;

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_BRODCAST_RESPONSE;
    }
}
