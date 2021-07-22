package com.itheima05;

public class Student {
    public String name; //姓名
    public int age; // 年龄
    public static String university; //学校   共享数据，所以设计为静态

    public void show() {
        System.out.println(name + ", " + age + ", " + university);
    }
}
