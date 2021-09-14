package cn.itcast.reflect;

import cn.itcast.domain.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> studentClass = Student.class;

        Method eat_method = studentClass.getMethod("eat");
        Student  s = new Student();
        eat_method.invoke(s);

        Method eat_method2 = studentClass.getMethod("eat", String.class);
        Student ss = new Student();
        eat_method2.invoke(ss, "饭");

        Method[] methods = studentClass.getMethods();
        for (Method method: methods) {
            System.out.println(method);
            //获取方法名
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名
        String className = studentClass.getName();
        System.out.println(className);
    }
}
