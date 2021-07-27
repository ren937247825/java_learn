package com.itheima05;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("world"); // 哈希表保存元素唯一，没有重复元素

        //遍历，增强for
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
