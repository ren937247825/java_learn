package com.itheima03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节流输出对象
        //FileOutputStream(String name): 创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("day11-File\\fos.txt");
        /**
         * 做了三件事：
         *      1.调用系统功能创建了文件
         *      2.创建了字节输出流对象
         *      3.让字节输出流对象指向创建好的文件
         */
        //void write(int b) :将指定的字节 写入此文件输出流
        fos.write(97);


        //最后释放资源
        //void close(): 关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
        File f  = new File("day11-File\\fos.txt");
        f.delete();
    }
}
