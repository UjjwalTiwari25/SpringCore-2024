package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext ("configkohli.xml");

        Kohli kohli = (Kohli)context.getBean("kohli");
        System.out.println(kohli);
// Register a shutdown hook
        context.registerShutdownHook();
    }
}
