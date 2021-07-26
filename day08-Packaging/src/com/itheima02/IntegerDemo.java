package com.itheima02;

public class IntegerDemo {
    public static void main(String[] args) {
        // int - String
        int number = 100;
        // 方式1
        String s1 = number + "";
        System.out.println(s1);

        // 方式2
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");

    }
}
