package com.itheima05;

public class Outer {
    private int num = 10;
    public void method() {
        int num2 = 20;
        class Inner {
            public void show() {
                System.out.println(num2);
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
