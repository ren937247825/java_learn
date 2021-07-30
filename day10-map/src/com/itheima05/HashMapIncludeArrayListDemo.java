package com.itheima05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("诸葛亮");
        array1.add("赵云");
        hm.put("三国演义", array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("唐僧");
        array2.add("孙悟空");
        hm.put("西游记", array2);

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("武松");
        array3.add("孙二娘");
        hm.put("水浒传", array3);

        //遍历HashMap集合
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }

    }
}
