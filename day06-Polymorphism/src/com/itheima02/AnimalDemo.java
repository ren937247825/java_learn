package com.itheima02;

public class AnimalDemo {

    public static void main(String[] args) {
        // 创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(1);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Cat("英短", 2);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
    }
}
