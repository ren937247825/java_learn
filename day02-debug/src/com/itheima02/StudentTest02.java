package com.itheima02;

public class StudentTest02 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
        System.out.println(s1.name +"," + s1.age);
        s1.study();
        s1.doHomeWork();

        Student s2 = new Student();
        s2.name = "张曼玉";
        s2.age = 29;

        System.out.println(s2.name + "," + s2.age);

        s2.study();
        s2.doHomeWork();
    }
}
