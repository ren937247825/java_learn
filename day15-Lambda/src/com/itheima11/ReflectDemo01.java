package com.itheima11;

import com.itheima09.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author rjf
 * @date 2022/3/31 14:33
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Constructor<?>[] getConstructors()  返回所有公共构造方法对象的数组
        //Constructor<?>[] getDeclaredConstructors()  返回所有的构造方法对象的数组
        //Constructor getConstructor(Class<?>... parameterTypes)  返回单个公共构造方法对象
        //Constructor getDeclaredConstructor(Class<?>... parameterTypes)  返回单个构造方法对象

        Class<?> c = Class.forName("com.itheima09.Student");
//        Constructor<?>[] cons = c.getConstructors();
//        Constructor<?>[] decs = c.getDeclaredConstructors();
//        for (Constructor con : decs) {
//            System.out.println(con);
//        }
        Constructor<?> con = c.getConstructor();
        System.out.println(con);
        Constructor<?> dec = c.getDeclaredConstructor();
        System.out.println(dec);
        Object o = con.newInstance();
//        Object o = dec.newInstance();
        System.out.println(o);
//        Student s = new Student();
//        System.out.println(s);
    }
}
