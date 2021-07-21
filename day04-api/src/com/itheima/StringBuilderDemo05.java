package com.itheima;

import java.util.Scanner;

public class StringBuilderDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String ss = reverse(line);
        System.out.println(ss);
    }

    public static String reverse(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String ss = sb.toString();
//        return ss;
        return new StringBuilder(s).reverse().toString();
    }
}
