package com.daquan.practice.day17.server.handler;

import com.daquan.practice.day17.protocol.response.JoinGroupBroadcastResponsePacket;
import com.daquan.practice.day17.protocol.response.JoinGroupResponsePacket;
import com.daquan.practice.day17.session.Session;
import com.daquan.practice.day17.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import com.daquan.practice.day17.protocol.request.JoinGroupRequestPacket;

public class JoinGroupRequestHandler extends SimpleChannelInboundHandler<JoinGroupRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupRequestPacket requestPacket) {
        // 1. 获取群对应的 channelGroup，然后将当前用户的 channel 添加进去
        String groupId = requestPacket.getGroupId();
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.add(ctx.channel());

        // 2. 构造加群响应发送给客户端
        JoinGroupResponsePacket responsePacket = new JoinGroupResponsePacket();

        responsePacket.setSuccess(true);
        responsePacket.setGroupId(groupId);
        ctx.channel().writeAndFlush(responsePacket);

        // 3.构造加群成功通知给群里的每一个客户端
        JoinGroupBroadcastResponsePacket joinGroupBroadcastResponsePacket = new JoinGroupBroadcastResponsePacket();
        joinGroupBroadcastResponsePacket.setGroupId(groupId);
        Session session = SessionUtil.getSession(ctx.channel());
        joinGroupBroadcastResponsePacket.setUserId(session.getUserId());
        joinGroupBroadcastResponsePacket.setUserName(session.getUserName());
        channelGroup.writeAndFlush(joinGroupBroadcastResponsePacket);
    }
}
