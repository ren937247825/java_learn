package com.itheima03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    /**
     * 列表迭代器
     */
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //往集合中添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
