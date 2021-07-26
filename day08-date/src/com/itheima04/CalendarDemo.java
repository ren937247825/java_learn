package com.itheima04;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // 获取日历对象
        Calendar c = Calendar.getInstance();

        //public int get(int field): 返回给定日历字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        c.set(2050, 10, 10);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
