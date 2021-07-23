package com.itheima01;

public class InterImpl extends Object implements Inter {
    public InterImpl() {
        super();
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
