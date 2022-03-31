package com.itheima11;

/**
 * @author rjf
 * @date 2022/3/31 13:52
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        //返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);

        //返回父类加载器
        ClassLoader c2 = c.getParent();
        System.out.println(c2);

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);
    }
}
