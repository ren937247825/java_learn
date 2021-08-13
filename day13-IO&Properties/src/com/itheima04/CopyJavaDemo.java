package com.itheima04;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day13-IO&Properties\\src\\com" +
                "\\itheima04\\PrintStreamDemo" +
                ".java"));
        //根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("day13-IO&Properties\\src\\com\\itheima04\\copy.java"),true);

        //读写数据，复制文件
        String line;
        while ((line=br.readLine()) != null) {
            pw.println(line);
        }

        pw.close();
        br.close();
    }
}
