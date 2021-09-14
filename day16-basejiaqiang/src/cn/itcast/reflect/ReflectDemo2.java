package cn.itcast.reflect;

import cn.itcast.domain.Student;

import java.io.FileReader;
import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) {
        Class<Student> cs = Student.class;

        Field[] fields = cs.getFields();
        for (Field field:  fields) {
            System.out.println(field);
        }

    }
}
