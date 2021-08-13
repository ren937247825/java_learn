package com.itheima01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.110.55");

        //public String getHostName(): 获取此ip地址的主机名
        String name = address.getHostName();
        //public String getHostAddress(): 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }
}
