package com.itheima05;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
