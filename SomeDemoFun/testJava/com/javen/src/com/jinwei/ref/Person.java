package com.jinwei.ref;

/**
 * Created by jinweih on 2018/9/9.
 */
public class Person implements China{
    private String name;
    private int age;
    public Person(){}
    public Person(String name) {
        this.setName(name);
    }
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayChina() {
        System.out.println("COUNTRY --->> " + this.COUNTRY + "  AUTHO --->> " + this.AUTHO);
    }

    public void sayHello(String name, int age) {
        System.out.println("NAME is ---->> " + name + "   AGE is ---->> " + age);
    }
}
