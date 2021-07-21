package com.ithema;

public class PhoneDemo {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2000;

        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
