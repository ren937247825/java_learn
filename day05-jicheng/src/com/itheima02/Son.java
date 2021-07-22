package com.itheima02;

public class Son extends Father {
    // 此时，Son类中就同时有drink 和 smoke 方法
    public static void main(String[] args) {
        Son s = new Son();
        s.drink();
        s.smoke();
    }
}
