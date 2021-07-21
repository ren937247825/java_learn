package com.itheima02;

public class StudentDemo {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name + "," + s.age);

        s.name = "林青霞";
        s.age = 20;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomeWork();
    }
}
