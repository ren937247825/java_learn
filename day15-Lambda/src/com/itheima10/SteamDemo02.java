package com.itheima10;

import java.util.ArrayList;

/**
 * @author rjf
 * @date 2022/3/29 16:42
 */
public class SteamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("50");
        int result = arrayList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
