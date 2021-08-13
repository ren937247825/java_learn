package com.itheima06;

public class ConverterDemo {
    public static void main(String[] args) {
        //lambda 写法
        useConverter(s -> Integer.parseInt(s));

        //引用类写法
        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
