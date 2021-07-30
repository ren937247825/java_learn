package com.itheima03;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g = new GenericImpl<String>();
        g.show("林青霞");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(22);
    }
}
