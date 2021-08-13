package com.itheima04;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        //publicStream(String fileName)
        PrintStream ps = new PrintStream("day13-IO&Properties\\ps.txt");

        //写数据
        //字节输出流有的方法
//        ps.write(97);

        //使用特有的方法写数据
        ps.print(97);
        ps.println();
        ps.print(98);
        ps.println(97);

        ps.close();
    }
}
