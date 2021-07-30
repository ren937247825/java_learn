package com.itheima01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        //V put(K key, V value) :添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V remove(Object key): 根据键删除键值对元素
//        System.out.println(map.remove("张无忌"));
//        System.out.println(map.remove("郭襄"));

        //void clear(): 移除所有的键值对元素
//        map.clear();
//        System.out.println(map);

        //boolean containsKey(Object key): 判断集合是否包含指定的键
//        System.out.println(map.containsKey("张无忌"));
//        System.out.println(map.containsKey("郭襄"));

        //boolean isEmpty(): 判断集合是否为 空
//        System.out.println(map.isEmpty());

        // int size() :集合 的长度，也就是集合中键值对的个数
//        System.out.println(map.size());

        System.out.println(map);
    }
}
