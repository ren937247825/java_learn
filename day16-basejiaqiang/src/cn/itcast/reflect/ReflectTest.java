package cn.itcast.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //创建Properties对象
        Properties pro = new Properties();

        //加载配置文件
        //获取文件路径
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //获取配置文件中的定义数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载进内存
        Class<?> cls = Class.forName(className);
        //创建对象
        Object o = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
