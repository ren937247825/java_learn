package com.itheima01;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在D:\\myjob 目录下创建一个文件java.txt
        File f1 = new File("D:\\myjob\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------");

        //需求二：在D:\\myjob目录下创建一个目录JavaSE
        File f2 = new File("D:\\myjob\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("----------");

        //需求三：在D:\myjob目录下创建一个多级目录JavaSE\\HTML
        File f3 = new File("D:\\myjob\\JavaSE\\HTML");
//        System.out.println(f3.mkdir());   //只能创建单级目录
        System.out.println(f3.mkdirs());
        System.out.println("-----------");

        //需求四：我要在D:\myjob 目录下创建一个文件javase.txt
        File f4 = new File("D:\\myjob\\javase.txt");
//        System.out.println(f4.mkdir());  //创建的不是文件，只是一个名为java.txt的目录
        System.out.println(f4.createNewFile());
    }
}
