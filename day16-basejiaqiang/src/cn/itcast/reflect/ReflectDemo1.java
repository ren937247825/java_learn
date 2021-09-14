package cn.itcast.reflect;

import cn.itcast.domain.Student;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls1 = Class.forName("cn.itcast.domain.Student");
        System.out.println(cls1);

        Class<Student> cls2 = Student.class;
        System.out.println(cls2);

        Student s = new Student();
        Class<? extends Student> cls3 = s.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
    }
}
