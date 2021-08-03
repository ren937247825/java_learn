package com.itheima01;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //调用方法
        method4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");

    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\myjob\\01-基础课(2.1)-JavaSE基础\\day01-Java基础语法\\001_Java语言发展史.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day12-byteCharStream\\001_Java语言发展史.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
