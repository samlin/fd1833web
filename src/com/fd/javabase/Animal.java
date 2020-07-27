package com.fd.javabase;

import static com.fd.javabase.com.fd.javabae.util.P.p;

public class Animal {
    {
        System.out.println("我是代码块");
    }

    static {
    }

    private static final int age = 20;
    private String name;

    public Animal() {
        System.out.println("我是构造器");
    }

    public Animal(String name) {
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println("age = " + age);
        p(30);
    }

    protected Animal eat() throws Exception {
        class a{}
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  class FDCat{
        private String name;
        public  int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            age=30;
            this.name = name;

            int age=40;

//            有三个变量为age  方法中的age  内部类中的age  外部类中的age
            age=60;//方法中的局部变量age
            this.age=70;//内部类中的age
            Animal.this.name="30";
        }
    }
}
class FDDog{}