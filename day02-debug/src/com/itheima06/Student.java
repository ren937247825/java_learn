package com.itheima06;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造方法");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
