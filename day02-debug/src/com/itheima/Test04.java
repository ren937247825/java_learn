package com.itheima;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

//        arr[2] = arr[1] + arr[0];
//        arr[3] = arr[2] + arr[1];
//        arr[4] = arr[3] + arr[2];


        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.println(arr[19]);
    }
}
