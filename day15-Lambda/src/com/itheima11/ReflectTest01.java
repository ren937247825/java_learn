package com.itheima11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author rjf
 * @date 2022/3/31 16:29
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Class<? extends ArrayList> c = arrayList.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(arrayList,"11");
        add.invoke(arrayList, "22");
        add.invoke(arrayList, "33");
        System.out.println(arrayList);
    }
}
