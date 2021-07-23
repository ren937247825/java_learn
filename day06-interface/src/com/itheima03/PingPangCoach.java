package com.itheima03;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {}

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练叫如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练讲英语");
    }
}
