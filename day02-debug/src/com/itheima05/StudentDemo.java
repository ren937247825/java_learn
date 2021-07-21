package com.itheima05;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(20);
        s.show();

        System.out.println(s.getName() + "---" + s.getAge());
    }
}
