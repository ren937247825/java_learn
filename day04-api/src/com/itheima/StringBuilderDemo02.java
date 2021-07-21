package com.itheima;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

//        StringBuilder sb2 = sb.append("hello");
//
//        System.out.println(sb);
//        System.out.println(sb2);
//
//        System.out.println(sb == sb2);
//        sb.append("hello");
//        sb.append("world");

        sb.append("hello").append("world");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
