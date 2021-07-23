package com.itheima01;

public class AnimalDemo02 {
    public static void main(String[] args) {
        //多态
        //向上转型 父类引用指向子类对象
        Animal a = new Cat();
        a.eat();

        //向下转型  子类对象 对象名 = （子类型）父类引用；
        Cat c = (Cat)a;
        c.eat();
        c.playGame();
    }
}
