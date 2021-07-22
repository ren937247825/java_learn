package com.itheima03;

public class Student extends Person {
//    private String name;
//    private String age;


    public Student() {
    }

    public Student(String name, String age) {
        super(name, age);
    }

    public void study() {
        System.out.println("学生学习");
    }
}
