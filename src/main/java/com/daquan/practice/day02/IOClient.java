package com.daquan.practice.day02;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @Desc TODO
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class IOClient {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": 张大全，hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
