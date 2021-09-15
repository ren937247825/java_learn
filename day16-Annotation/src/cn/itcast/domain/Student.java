package cn.itcast.domain;

public class Student {
    private String name;
    private int age;

    public String a;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void eat(String food) {
        System.out.println("eat...." + food);
    }

    public void sleep() {
        System.out.println("sleep....");
    }
}
