package com.itheima02;

import java.io.*;


public class CopyFoldersDemo {
    public static void main(String[] args) {
        //创建数据源File对象，路径是D:\360Downloads
        File srcFile = new File("D:\\360Downloads");
        //创建目的地File对象，路径是C:\\
        File destFile = new File("C:\\");

        //写方法实现文件夹的复制，参数为数据源File对象和目的地File对象

    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //判断数据源File是否是目录
        if (srcFile.isDirectory()) {
            //在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            //获取数据源File所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            //遍历该File数组，得到每一个File对象
            for (File file : fileArray) {
                //把该File作为数据源对象，递归调用复制文件夹的方法
                copyFolder(file, newFolder);
            }
        } else {
            //说明是文件，直接复制，用字节流
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }

}
