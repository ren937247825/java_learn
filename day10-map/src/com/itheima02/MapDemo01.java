package com.itheima02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //获取所有键的集合，用keySet()方法实现
        Set<String> keySet = map.keySet();
        for (String key: keySet) {
            String value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
