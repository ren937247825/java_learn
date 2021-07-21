package com.itheima;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        /**
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        String s = sb.toString();
        System.out.println(s);
        */
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
