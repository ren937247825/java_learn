package com.itheima11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author rjf
 * @date 2022/3/31 15:29
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Field[] getFields() 返回所有公共成员变量对象的数组
        //Field[] getDeclaredFields()   返回所有成员变量对象的数组
        //Field getField(String name)   返回单个公共成员变量对象
        //Field getDeclaredField(String name)   返回单个成员变量对象
        Class<?> c = Class.forName("com.itheima11.Student");
        Field[] fields = c.getFields();
        Field[] fields1 = c.getDeclaredFields();
        for (Field field: fields1) {
            System.out.println(field);
        }
        Field field = c.getField("address");
        System.out.println(field);

        Field name = c.getDeclaredField("name");


        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        System.out.println(o);
        field.set(o, "西安");
        System.out.println(o);

//        Constructor<?> con1 = c.getConstructor();
//        Object o1 = con1.newInstance();
//        name.set(o1, "刘");
//        System.out.println(o1);

    }
}
