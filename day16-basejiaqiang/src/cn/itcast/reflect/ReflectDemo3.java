package cn.itcast.reflect;

import cn.itcast.domain.Student;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Student> cs = Student.class;
        Constructor<Student> constructor = cs.getConstructor(String.class, int.class);

        System.out.println(constructor);
    }
}
