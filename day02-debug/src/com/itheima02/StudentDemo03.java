package com.itheima02;

public class StudentDemo03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 20;
        System.out.println(s1.name + "," + s1.age);

        Student s2 = s1;
        s2.name = "张曼玉";
        s2.age = 28;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);
    }
}
