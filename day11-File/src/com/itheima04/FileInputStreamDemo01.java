package com.itheima04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        //FileInputstream(String name)
        FileInputStream fis = new FileInputStream("day11-File\\fos.txt");

        int by;
        /**
         * fis.read() :读数据
         * by = fis.read() : 把读取到的数据赋值给by
         * by != -1 : 判断读取到的数据是否是 -1
         *
         */
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
        }

        //释放资源
        fis.close();
    }
}
