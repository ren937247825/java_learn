package com.itheima01;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
