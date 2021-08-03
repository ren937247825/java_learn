package com.itheima04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("C:\\64.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("day11-File\\64.jpg");

        //读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0 , len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
