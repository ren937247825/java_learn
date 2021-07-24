package com.itheima01;

public class SystemDemo {
    public static void main(String[] args) {
        //获取开始时间点
        long start = System.currentTimeMillis();
        for (int i = 1; i<= 10000; i++) {
            System.out.println(i);
        }

        //获取代码运行结束后的时间节点
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
