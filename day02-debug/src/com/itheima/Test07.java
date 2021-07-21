package com.itheima;

public class Test07 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 5};

        boolean flag = compare(arr1, arr2);
        System.out.println(flag);

    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int x =0; x < arr1.length; x ++) {
            if (arr1[x] != arr2[x] ) {
                return false;
            }
        }
        return true;
    }
}
