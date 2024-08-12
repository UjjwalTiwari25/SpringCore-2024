package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Anushka implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Anushka(){
        super();
    }

    @Override
    public String toString() {
        return "Anushka [price=" + price + "]";
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init method");
    }


    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
}
