package com.springcore.constinj;

import org.springframework.context.annotation.Primary;

public class Certi {
    String name;

    public Certi(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
         return this.name;
    }
}
