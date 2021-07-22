package com.itheima03;

public class Teacher extends Person {
//    private String name;
//    private String age;


    public Teacher() {
    }

    public Teacher(String name, String age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("教书育人");
    }
}
