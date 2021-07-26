package com.itheima01;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2,  3};
            System.out.println(arr[3]);     // new ArrayIndexOutOfBoundsException();
            System.out.println("这里能访问到吗？");
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            // public String getMessage(): 返回此throwable 的详情消息字符串
            System.out.println(e.getMessage());
            // 3

            //public String toString() : 返回此可抛出的简短描述
//            System.out.println(e.toString());
            // java.lang.ArrayIndexOutOfBoundsException: 3

            // public void printStackTrace(): 把异常的错误信息输出在控制台
            e.printStackTrace();
//            java.lang.ArrayIndexOutOfBoundsException: 3
//            at com.itheima01.ExceptionDemo02.method(ExceptionDemo02.java:13)
//            at com.itheima01.ExceptionDemo02.main(ExceptionDemo02.java:6)
        }
    }
}
