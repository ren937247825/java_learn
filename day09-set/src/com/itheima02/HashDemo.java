package com.itheima02;

public class HashDemo {
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("林青霞", 30);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode()); //828454043
        System.out.println(s1.hashCode()); //828454043
        System.out.println("--------");

        Student s2 = new Student("林青霞", 30);

        //默认情况下，不同对象的哈希值是不同的
        //通过方法的重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());

        System.out.println("hello".hashCode()); // 99162322
        System.out.println("world".hashCode()); // 113318802
        System.out.println("java".hashCode()); // 3254818
        System.out.println("world".hashCode()); // 113318802
        System.out.println("------");

        System.out.println("重地".hashCode()); // 1179395
        System.out.println("通话".hashCode()); // 1179395
    }
}
