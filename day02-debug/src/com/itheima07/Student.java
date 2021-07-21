package com.itheima07;

public class Student {

    private String name;
    private int age;

    public Student() {}

    public Student( String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
