package com.itheima01;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        // 创建日期对象
        Date d1 = new Date();
        long time = System.currentTimeMillis();
        d1.setTime(time);

        System.out.println(d1);
    }
}
