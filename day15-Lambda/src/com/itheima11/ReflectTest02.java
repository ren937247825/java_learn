package com.itheima11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author rjf
 * @date 2022/3/31 16:41
 */
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("day15-Lambda\\pro.txt");
        properties.load(fileReader);
        fileReader.close();

        String className = properties.getProperty("className");
        String classMethod = properties.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        Method method = c.getMethod(classMethod);
        method.invoke(o);
    }
}
