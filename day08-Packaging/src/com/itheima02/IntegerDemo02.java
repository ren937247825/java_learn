package com.itheima02;

public class IntegerDemo02 {
    public static void main(String[] args) {
        // string - int
        String s = "100";

        // 方式1：String --- Integer --- int
        Integer i = Integer.valueOf(s);
        // public int intValue()
        int x = i.intValue();
        System.out.println(x);

        // 方式2
        // public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
