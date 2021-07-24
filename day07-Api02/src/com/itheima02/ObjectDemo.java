package com.itheima02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(20);
        System.out.println(s.getName() + ", " + s.getAge());
        System.out.println(s);
        System.out.println(s.toString());
    }
}
