package com.itheima04;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog("泰迪", "1");
        System.out.println(d.getName() + ", " + d.getAge());
        d.Gatekeeper();

        Cat c = new Cat("英短", "2");
        System.out.println(c.getName() + ", " + c.getAge());
        c.catchMice();
    }
}
