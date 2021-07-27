package com.itheima06;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 30);
        Student s3 = new Student("diaochan", 28);
        Student s4 = new Student("yangyuhuan", 29);
        Student s5 = new Student("linqingxia", 33);
        Student s6 = new Student("linqingxia", 33);

        //把学生添加到集合中
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
