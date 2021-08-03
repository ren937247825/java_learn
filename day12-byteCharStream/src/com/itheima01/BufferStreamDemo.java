package com.itheima01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferedOutputStream(OutputStream out)
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day12-byteCharStream\\bos.txt"));

        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();

        //字节缓冲输入流：BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day12-byteCharStream\\bos.txt"));

        //一次读取一个字节数据
//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.println((char)by);
//        }
        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        //释放资源
        bis.close();
    }
}
