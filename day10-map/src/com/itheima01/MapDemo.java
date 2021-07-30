package com.itheima01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        // V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("itheima01", "林青霞");
        map.put("itheima02", "张曼玉");
        map.put("itheima03", "王祖贤");

        //输出集合对象
        System.out.println(map);
    }
}
