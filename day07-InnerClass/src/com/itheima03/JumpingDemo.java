package com.itheima03;

public class JumpingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.useJumping(j);

        Jumping j2 = jo.getJumping(); //new Cat()
        j2.jump();
    }
}
