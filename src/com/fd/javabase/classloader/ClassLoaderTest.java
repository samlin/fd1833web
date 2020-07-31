package com.fd.javabase.classloader;

import com.fd.javabae.Dog;
import org.junit.Test;

public class ClassLoaderTest {
    @Test
    public void testClassLoader() throws Exception {
        ClassLoader classLoader = Object.class.getClassLoader();
        Dog dog=new Dog();

//       默认获取的是系统类加载器
        ClassLoader classLoader1 = dog.getClass().getClassLoader();
        System.out.println("classLoader = " + classLoader);
        System.out.println("classLoader1 = " + classLoader1);

//        可以获取系统类加载器的父类,扩展类加载器
        ClassLoader parent = classLoader1.getParent();
        System.out.println("classLoader1.getParent() = " + parent);

//因为扩展类的类加载器是启动类加载器,但是启动类加载器是属于native类型,是用c编写,所以不能直接访问,值为null
        ClassLoader bootClassLoader = parent.getParent();
        System.out.println("parent.getParent() = " + bootClassLoader);
    }
}
