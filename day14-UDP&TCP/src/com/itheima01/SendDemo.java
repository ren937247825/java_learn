package com.itheima01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象（DatagramSocket)
        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        byte[] bys = "hello".getBytes();

        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.110.55"), 10086);

        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);

        //关闭发送端
        //void close() 关闭此数据报套接字
        ds.close();
    }
}
