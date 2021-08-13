package com.itheima05;

public class PrintableDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法
//        usePrintable((String s) -> {
//            System.out.println(s);
//        });

        //lambda 简化写法
        usePrintable(s -> System.out.println(s));

        //方法引用
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p) {
        p.printString("爱生活");
    }
}
