package com.itheima10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rjf
 * @date 2022/3/30 9:55
 */
public class StreamDemo04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
//        //收集到list集合
//        Stream<String> stringStream = list.stream().filter(s -> s.length() == 3);
//        List<String> list1= stringStream.collect(Collectors.toList());
//        for (String name : list1) {
//            System.out.println(name);
//        }
        //收集到set集合
        Set<Integer> stringSet = new HashSet<>();
        stringSet.add(11);
        stringSet.add(22);
        stringSet.add(33);
        stringSet.add(44);
        stringSet.add(55);
        Stream<Integer> integerStream = stringSet.stream().filter(age -> age>25);
        Set<Integer> ages = integerStream.collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};
        Stream<String> integerStream1 = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 25);
        Map<String, Integer> map = integerStream1.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
