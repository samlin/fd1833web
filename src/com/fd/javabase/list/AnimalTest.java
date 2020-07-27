package com.fd.javabase.list;

import com.fd.javabae.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        //如果在调用泛型的时候,不传入任何参数,那么默认的泛型类型是Object
        Animal animal=new Animal();
        animal.setT("5");

        //使用泛型后,jdk7以后,后面的泛型类型可以不写,这种写法简称菱形语法
        Animal<Dog> dog=new Animal<>();

//        使用泛型后,传入的类型必须要跟定义的一致,从而解决了类型强转的异常问题,把运行期异常转化成编译期异常
        dog.setT(new Dog());

    }
}
