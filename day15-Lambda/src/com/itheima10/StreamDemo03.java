package com.itheima10;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author rjf
 * @date 2022/3/29 16:57
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");
        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3), womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).forEach(p->System.out.println(p.getName()));
    }
}
