package com.itheima02;

import java.io.File;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        //给定一个路径创建一个File对象
        File srcFile = new File("D:\\myjob");

        //调用方法
        getAllFilePath(srcFile);
    }

    //顶一个方法，用于获取给定目录下的所有内容，参数为第一步创建的File对象
    public static void getAllFilePath(File srcFile) {
        // 获取给定的File目录下所有的文件或目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if (fileArray != null) {
            for (File file : fileArray) {
                //判断该File对象是否为目录
                if (file.isDirectory()){
                    //是，递归调用
                    getAllFilePath(file);
                } else {
                    //不是，获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
