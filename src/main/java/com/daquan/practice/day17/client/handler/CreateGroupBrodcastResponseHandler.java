package com.daquan.practice.day17.client.handler;

import com.daquan.practice.day17.protocol.response.JoinGroupBroadcastResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/18
 */
public class CreateGroupBrodcastResponseHandler extends SimpleChannelInboundHandler<JoinGroupBroadcastResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupBroadcastResponsePacket createGroupResponsePacket) {
        System.out.println(createGroupResponsePacket.getUserName()+"加入群["+createGroupResponsePacket.getGroupId()+"]聊成功，id 为[" + createGroupResponsePacket.getUserId() + "]");
    }
}
