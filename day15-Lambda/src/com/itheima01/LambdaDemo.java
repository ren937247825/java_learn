package com.itheima01;

public class LambdaDemo {
    public static void main(String[] args) {
        //方式一
        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);
        t.start();

        //方式二
        //匿名内部类的方式改进
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();

        //方式三
        //Lambda表达式的方式改进
        new Thread( () -> {
            System.out.println("多线程程序启动了");
        }).start();

    }
}
