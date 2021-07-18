package com.daquan.practice.day19.client.console;

import io.netty.channel.Channel;
import com.daquan.practice.day19.protocol.request.LogoutRequestPacket;

import java.util.Scanner;

public class LogoutConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        LogoutRequestPacket logoutRequestPacket = new LogoutRequestPacket();
        channel.writeAndFlush(logoutRequestPacket);
    }
}
