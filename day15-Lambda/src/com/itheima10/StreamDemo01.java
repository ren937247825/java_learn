package com.itheima10;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author rjf
 * @date 2022/3/29 16:06
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("成龙");
        arrayList.add("风清扬");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

//        Stream<String> s1 = arrayList.stream().limit(4);
//        Stream<String> s2 = arrayList.stream().skip(2);
//        Stream.concat(s1, s2).distinct().forEach(System.out::println);
//        arrayList.stream().sorted((s1, s2) -> {
//            int num = s1.length()-s2.length();
//            int num2 = num==0?s1.compareTo(s2):num;
//            return num2;
//        }).forEach(System.out::println);
        long count = arrayList.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
