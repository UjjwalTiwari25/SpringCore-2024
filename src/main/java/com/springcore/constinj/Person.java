package com.springcore.constinj;

public class Person {
    private String name;
    private int age;
    private Certi certi;

    public Person(String name , int age , Certi certi) {
        this.name = name;
        this.age = age;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.age+"{"+this.certi.name+"}";
    }
}
