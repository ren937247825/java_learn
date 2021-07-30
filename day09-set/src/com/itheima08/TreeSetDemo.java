package com.itheima08;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        // 创建学生对象
        Student s1 = new Student("林青霞", 98, 100);
        Student s2 = new Student("张曼玉", 95, 95);
        Student s3 = new Student("王祖贤", 100, 93);
        Student s4 = new Student("柳岩", 100, 97);
        Student s5 = new Student("风清扬", 98, 98);
        Student s6 = new Student("左冷禅", 97, 99);
        Student s7 = new Student("赵云", 97, 99);

        //把学生对象添加到集合中
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getChinese() + ", " + s.getMath() + ", " + s.getSum());
        }
    }
}
