package com.itheima04;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("day11-File\\fos.txt");
        /**
         * hello\r\n
         * world\r\n
         *
         * 第一次：helLo
         * 第二次：\r\nwor
         * 第三次：ld\r\nr
         */
        byte[] bys = new byte[1024];    //1024及其整数倍
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }

        //释放资源
        fis.close();
    }
}
