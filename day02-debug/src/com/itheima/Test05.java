package com.itheima;

public class Test05 {
    public static void main(String[] args) {
        // 百钱百鸡
        for (int x = 0; x <= 20; x ++) {
            for(int y = 0; y <= 33; y ++) {
                int z = 100 - x- y;
                if (z % 3 == 0 && 5*x + 3 *y + z /3 == 100) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
    }
}
