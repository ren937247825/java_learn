package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author rjf
 * @date 2022/3/31 15:24
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.itheima11.Student");
        Constructor<?> dec = c.getDeclaredConstructor(String.class);
        dec.setAccessible(true);    //暴力反射，取消访问检测
        Object o = dec.newInstance("林青霞");
        System.out.println(o);
    }
}
