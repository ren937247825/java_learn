package com.itheima03;

public class AddableDemo {
    public static void main(String[] args) {
        //在主方法中调用useAddable
        useAddable((int x, int y) -> {
            return x + y;
        });
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
