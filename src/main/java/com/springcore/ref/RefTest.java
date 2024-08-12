package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext ("referenceconfig.xml");
       A temp = (A) context.getBean ( "aref" );
        System.out.println (temp.getX ());
        System.out.println (temp.getObj ().getY ());
        System.out.println (temp);
    }
}
