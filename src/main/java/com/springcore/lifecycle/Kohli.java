package com.springcore.lifecycle;

public class Kohli {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside setter method");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Inside setter method");
        this.age = age;
    }

    public Kohli(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Kohli(){
        super();
    }

    @Override
    public String toString() {
        return "Kohli [name=" + name + ", age=" + age + "]";
    }
    public void init() {
        System.out.println("Inside init method");
    }
    public void destroy() {
        System.out.println("Inside destroy method");
    }
}
