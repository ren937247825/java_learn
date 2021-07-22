package com.itheima04;

public class Dog extends Animal {

    public Dog() {}

    public  Dog(String name, String age) {
        super(name, age);
    }

    public void Gatekeeper() {
        System.out.println("狗狗职责就是看门");
    }
}
