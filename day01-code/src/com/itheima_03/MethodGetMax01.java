package com.itheima_03;

public class MethodGetMax01 {
    public static void main(String[] args) {
        getMax(10, 20);
        // 调用方法注意参数数量和类型

        int a = 10;
        int b = 20;
        getMax(a, b);
    }


    //
    public static void getMax(int a, int b){
        if(a> b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
