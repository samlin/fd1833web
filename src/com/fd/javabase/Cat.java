package com.fd.javabase;

import static com.fd.javabase.com.fd.javabae.util.P.p;

public class Cat extends Animal{
    public Cat() {
        super();
    }
    @Override
    public Animal eat()   {
        return null;
    }

    public static void main(final String[] args) {
//        args=null;
        Cat cat = new Cat();
        cat.setName("旺财");
    }
}
