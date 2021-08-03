package com.itheima01;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //需求1：在当前模块目录下创建java.txt文件
//        File f1 = new File("D:\\myjob\\java.txt");
        File f1 = new File("day11-File\\java.txt");
//        System.out.println(f1.createNewFile());

        //需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("----------");

        //需求3：在当前模块目录下创建itcast目录
        File f3 = new File("day11-File\\itcast");
//        System.out.println(f3.mkdir());

        //需求4：删除当前模块目录下的itcast目录
        System.out.println(f3.delete());
        System.out.println("---------");

        // 需求5： 在当前模块下创建一个目录itcast,然后在 该目录下创建一个文件java.txt
        File f4 = new File("day11-File\\itcast");
        System.out.println(f4.mkdir());
        File f5 = new File("day11-File\\itcast\\java.txt");
        System.out.println(f5.createNewFile());

        //需求6：删除当前模块目录itcast
        System.out.println(f5.delete());
        System.out.println(f4.delete());
    }
}
