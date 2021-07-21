package com.itheima_06;

public class MethodDemo6 {
    public static void main(String[] args) {
        System.out.println(compare(10, 20));
        System.out.println(compare((byte) 10, (byte) 10));
        System.out.println(compare((short) 10, (short) 20));
        System.out.println(compare(10L, 10L));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }
}
