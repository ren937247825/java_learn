package com.itheima01;

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age);
        a.eat();
    }
}
