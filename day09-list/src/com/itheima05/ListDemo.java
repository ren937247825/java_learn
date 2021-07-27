package com.itheima05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    /**
     * 三种方式遍历list集合
     */
    public static void main(String[] args) {
        //创建list集合对象
        List<Student> list = new ArrayList<Student>();

        //创建 学生对象
        Student s1 = new Student("林青霞", 20);
        Student s2 = new Student("张曼玉", 23);
        Student s3 = new Student("王祖贤", 30);

        //把学生添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器：集合特有的遍历方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + ", " + s.getAge());
        }

        System.out.println("--------");

        //普通for:带有索引的遍历方式
        for (int i = 0; i< list.size(); i ++ ) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }

        System.out.println("--------");

        //增强for:最方便的遍历方式
        for (Student s: list) {
            System.out.println(s.getName()  + ", " + s.getAge());
        }



    }
}
