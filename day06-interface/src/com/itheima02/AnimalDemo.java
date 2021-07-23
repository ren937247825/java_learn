package com.itheima02;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumping j = new Cat();
        j.jump();
        System.out.println("---------");

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(1);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
        //a.jump();

        a = new Cat("英短", 2);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
        System.out.println("----------");

        Cat c = new Cat();
        c.setName("美短");
        c.setAge(3);
        System.out.println(c.getName() + ", " + c.getAge());
        c.eat();
        c.jump();
    }
}
