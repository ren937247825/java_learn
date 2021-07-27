package com.itheima04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForDemo {
    /**
     * 增加for循环
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("--------");

        String[] strArray = {"hello", "world", "java"};
        for (String s: strArray) {
            System.out.println(s);
        }

        System.out.println("--------");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------");

//        // 内部原理是一个Iterator 迭代器
//        //ConcurrentModificationException
//        for (String s : list) {
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
    }
}
