package com.itheima03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, Student> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("张曼玉", 30);
        Student s2 = new Student("林青霞", 29);
        Student s3 = new Student("王祖贤", 32);

        //添加到集合中
        hm.put("itheima001", s1);
        hm.put("itheima002", s2);
        hm.put("itheima003", s3);

        //方式1：键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + ", " + value.getAge());
        }
        System.out.println("----------");

        //方式二：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + ", " + value.getName() + ", " + value.getAge());
        }
    }
}
