package com.itheima02;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //创建数据源目录File对象，路径是D:\\myjob\\javalearn
        File srcFolder  = new File("D:\\myjob\\javalearn");

        //获取数据源目录File对象的名称(javalearn)
        String srcFolderName = srcFolder.getName();

        //创建目的地目录File对象，路径名是模块名 + javalearn组成（day13-IO&Properties\\javalearn)
        File destFolder = new File("day13-IO&Properties", srcFolderName);

        //判断目的地目录对应File是否存在，如果不存在 ，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        //获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile: listFiles) {
            //数据源文件
            //获取数据源文件File对象的名称
            String srcFileName = srcFile.getName();
            //创建目的地文件File对象，路径名是目的地目录+mn.jpg组成
            File destFile = new File(destFolder, srcFileName);
            //复制文件
            copyFile(srcFile, destFile);
        }

    }
    private static void copyFile(File srcFIle, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFIle));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0 , len);
        }

        bos.close();
        bis.close();
    }
}
