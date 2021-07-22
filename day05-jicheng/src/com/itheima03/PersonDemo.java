package com.itheima03;

public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象，并进行测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge("30");
        System.out.println(t1.getName() + ", " + t1.getAge());

        Teacher t2 = new Teacher("风晴雪", "20");
        System.out.println(t2.getName() + ", " + t2.getAge());

        Student s = new Student("张三", "20");
        System.out.println(s.getName() +", " + s.getAge());
    }
}
