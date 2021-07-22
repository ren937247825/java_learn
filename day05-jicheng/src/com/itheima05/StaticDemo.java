package com.itheima05;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "北京大学";

        Student s = new Student();
        s.name = "林青霞";
        s.age = 20;
        s.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 30;
        s2.show();
    }
}
