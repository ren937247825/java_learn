package com.itheima09;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //创建Set集合对象
        Set<Integer> set = new TreeSet<Integer>();

        //创建随机数对象
        Random r = new Random();

        //判断集合的长度是不是小于10
        while (set.size()< 10) {
            //产生一个随机数，添加到集合
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        //遍历集合
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
