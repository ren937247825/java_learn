package com.itheima09;

public class StudentDemo {
    public static void main(String[] args) {
        //lambda 简化写法
        useStudentBuilder(((name, age) -> new Student(name, age)));

        //引用构造器
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("林青霞", 30);
        System.out.println(s.getName() + ", " + s.getAge());

    }
}
