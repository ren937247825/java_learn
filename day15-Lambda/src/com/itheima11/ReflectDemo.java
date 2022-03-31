package com.itheima11;

import com.itheima09.Student;

/**
 * @author rjf
 * @date 2022/3/31 14:13
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取该类的class属性
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("---------");

        //调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3);
        System.out.println(c1 == c3);

        //使用Class类中的静态方法forName(String className);
        Class<?> c4 = Class.forName("com.itheima09.Student");
        System.out.println(c4 == c1);
    }
}
