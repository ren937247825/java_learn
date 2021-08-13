package com.itheima07;

public class PrinterDemo {
    public static void main(String[] args) {
        //lambda 简化写法
        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象的写法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("hello");

    }
}
