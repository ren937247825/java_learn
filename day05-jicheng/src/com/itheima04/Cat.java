package com.itheima04;

public class Cat extends Animal {
    public Cat() {}

    public Cat(String name, String age) {
        super(name, age);
    }

    public void catchMice() {
        System.out.println("猫猫的职责就是抓老鼠");
    }
}
