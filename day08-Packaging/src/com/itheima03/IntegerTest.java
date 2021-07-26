package com.itheima03;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "91 27 46 38 50";

        // 把字符串的数字数据储存到一个int 类型的数组中
        String[] strArray = s.split(" ");
//        System.out.println(strArray);

        // 定义一个数组， 把String[] 数组中的每一个元素储存到 int 数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        // 对 int 数组进行排序
        Arrays.sort(arr);

        // 把排序后的int 数组中的元素进行拼接得到一个字符串，这里采用StringBuilder来实现
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i ++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();

        // 输出结果
        System.out.println(result);
    }
}
