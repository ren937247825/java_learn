package com.itheima03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "林青霞";
        //s.age = -30;

        s.setAge(30);
        s.show();
    }
}
