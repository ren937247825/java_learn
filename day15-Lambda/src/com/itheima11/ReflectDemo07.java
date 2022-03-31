package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author rjf
 * @date 2022/3/31 16:19
 */
public class ReflectDemo07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.itheima11.Student");

        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        Method method1 = c.getMethod("method1");
        method1.invoke(o);

        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(o, "林青霞");
        System.out.println(o);

        Method method3 = c.getMethod("method3", String.class, int.class);
        Object o1 = method3.invoke(o, "林青霞", 30);
        System.out.println(o1);

        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(o);
    }
}
