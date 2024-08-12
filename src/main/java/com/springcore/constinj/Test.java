package com.springcore.constinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("configconinj.xml");
        Person person =(Person) context.getBean ( "person" );
        System.out.println (person);
        Addition addition = (Addition) context.getBean ( "add" );
        addition.doSum ();
    }
}
