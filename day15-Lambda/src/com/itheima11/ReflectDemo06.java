package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author rjf
 * @date 2022/3/31 16:05
 */
public class ReflectDemo06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Method[] getMethods() 返回所有公共成员方法对象的数组，包括继承的
        //Method[] getDeclaredMethods() 返回所有的成员方法对象的数组，不包括继承的
        //Method getMethod(String name, Class<?>...parameterTypes)  返回单个公共成员方法对象
        //Method getDeclaredMethod(String name, Class<?>...parameterTypes)  返回单个成员方法对象
        Class<?> c = Class.forName("com.itheima11.Student");
//        Method[] methods = c.getMethods();
//        Method[] decs = c.getDeclaredMethods();
//        for (Method method: decs) {
//            System.out.println(method);
//        }

        Method getName = c.getMethod("method1");
        System.out.println(getName);

        Method method1 = c.getDeclaredMethod("function");
        System.out.println(method1);

        Constructor<?> cons = c.getConstructor();
        Object o = cons.newInstance();
        getName.invoke(o);
    }
}
