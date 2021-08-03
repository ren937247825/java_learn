package com.itheima03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        //加入 finall来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day11-File\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
