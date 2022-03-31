package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author rjf
 * @date 2022/3/31 15:11
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取class对象
        Class<?> c = Class.forName("com.itheima11.Student");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        System.out.println(con);
        Object o = con.newInstance("林青霞", 30, "西安");
        System.out.println(o);
    }
}
