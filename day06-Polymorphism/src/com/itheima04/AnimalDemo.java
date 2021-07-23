package com.itheima04;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照 多态的方式
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(1);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("-----------------");
        a = new Cat("英短", 2);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
    }
}
