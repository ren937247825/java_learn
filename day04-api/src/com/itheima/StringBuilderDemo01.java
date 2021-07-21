package com.itheima;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuilder sb2 = new StringBuilder("heLlo");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}
