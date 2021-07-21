package com.itheima_04;

public class MethodReturn {
    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);

        // 直接调用函数打印，不调用变量
        System.out.println(getMax(10, 30));
    }

    public static int getMax(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }

    }
}
