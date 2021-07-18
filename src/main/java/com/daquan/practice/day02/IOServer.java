package com.daquan.practice.day02;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Desc 我们简化下场景：客户端每隔两秒发送一个带有时间戳的 "hello world" 给服务端，服务端收到之后打印。
 * @Author zhangdaquan
 * @Date 2021/7/10
 */
public class IOServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8000);

        // (1) 接收新连接线程
        new Thread(() -> {
            while (true) {
                try {
                    // (1) 阻塞方法获取新的连接
                    Socket socket = serverSocket.accept();
                    System.out.println("accept");
                    // (2) 每一个新的连接都创建一个线程，负责读取数据
                    new Thread(() -> {
                        try {
                            System.out.println("read");
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            System.out.println("input");
                            // (3) 按字节流方式读取数据
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println("circle:"+len);
                                System.out.println(new String(data, 0, len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {
                }

            }
        }).start();
    }
}
