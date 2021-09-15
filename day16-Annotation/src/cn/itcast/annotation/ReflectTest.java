package cn.itcast.annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.itcast.annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //解析注解
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取上边的注解
        Pro an = reflectTestClass.getAnnotation(Pro.class); //其实在内存中生成了一个该注解接口的子类实现对象

        //调用注解对象中定义的抽象方法
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //加载进内存
        Class<?> cls = Class.forName(className);
        //创建对象
        Object o = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
