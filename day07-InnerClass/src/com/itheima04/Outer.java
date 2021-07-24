package com.itheima04;

public class Outer {
    private int num = 10;
    public class Inner {    // 内部类
        public void show() {
            System.out.println(num);    // 可以直接访问外部的变量
        }
    }

    public void method() {
        Inner i = new Inner();      // 访问内部类成员，必须创建对象
        i.show();
    }
}
