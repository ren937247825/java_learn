package com.itheima08;

public class MyStringDemo {
    public static void main(String[] args) {
        //lambda 简化写法
        useMyString((s, x, y) -> s.substring(x, y));

        //引用类的实例方法
        useMyString(String::substring);
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("hello", 2, 5);
        System.out.println(s);
    }
}
