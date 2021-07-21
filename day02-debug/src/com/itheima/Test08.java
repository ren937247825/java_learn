package com.itheima;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        // 查找数组的下标，不存在返回-1
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");

        int number = sc.nextInt();
        int index = -1;
        for (int x = 0; x < arr.length; x ++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        System.out.println(index);
    }
}
