package com.itheima01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V get(Object key): 根据键获取值
//        System.out.println(map.get("张无忌"));
//        System.out.println(map.get("郭襄"));

        //Set<k> keySet(): 获取所有键的集合
//        Set<String> keySet = map.keySet();
//        for (String key: keySet) {
//            System.out.println(key);
//        }

        //Collection<v> values(): 获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
