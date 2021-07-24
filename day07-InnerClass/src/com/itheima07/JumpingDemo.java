package com.itheima07;

public class JumpingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.method(j);

        Jumping j2 = new Dog();
        jo.method(j2);
        System.out.println("--------");

        //匿名内部类的简化
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
        //匿名内部类的简化
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
