package com.itheima01;

public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable方法
        Eatable e = new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果");
            }
        });

        //lambda 表达式
        useEatable(() ->{
            System.out.println("一天一苹果");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
