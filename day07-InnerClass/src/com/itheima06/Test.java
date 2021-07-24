package com.itheima06;

public class Test {
    public static void main(String[] args) {
        new Inter(){
            @Override
            public void method() {
                System.out.println("我是匿名内部类");
            }
        }.method();     //直接调用方法
    }
}
