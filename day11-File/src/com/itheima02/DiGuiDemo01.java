package com.itheima02;

public class DiGuiDemo01 {
    public static void main(String[] args) {
        //调用方法
        int result = jc(5);
        //输出结果
        System.out.println("5的阶乘是：" + result);
    }

    public static int jc(int n) {
        //在方法内部判断该变量的值是否是1
        if (n == 1) {
            //是：返回1
            return 1;
        } else {
            return n * jc(n - 1) ;
        }
    }
}
