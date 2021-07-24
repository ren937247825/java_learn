package com.itheima03;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(20);

        //需求：比较两个对象的内容是否相同
        System.out.println(s1.equals(s2));

    }
}
