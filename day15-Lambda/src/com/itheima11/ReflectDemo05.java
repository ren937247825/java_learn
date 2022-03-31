package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author rjf
 * @date 2022/3/31 15:56
 */
public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("com.itheima11.Student");
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        Field dec = c.getDeclaredField("name");
        dec.setAccessible(true);
        dec.set(o, "林青霞");
        System.out.println(o);

        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o, 30);
        System.out.println(o);

        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o, "西安");
        System.out.println(o);
    }
}
