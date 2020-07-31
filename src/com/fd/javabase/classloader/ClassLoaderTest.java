package com.fd.javabase.classloader;

import com.fd.javabae.Dog;
import org.junit.Test;

import java.io.InputStream;

public class ClassLoaderTest {
    @Test
    public void testClassLoader() throws Exception {
        ClassLoader classLoader = Object.class.getClassLoader();
        Dog dog=new Dog();

//       默认获取的是系统类加载器
        ClassLoader systemClassLoader = dog.getClass().getClassLoader();
        System.out.println("classLoader = " + classLoader);
        System.out.println("systemClassLoader = " + systemClassLoader);

//        可以获取系统类加载器的父类,扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println("systemClassLoader.getParent() = " + parent);

//因为扩展类的类加载器是启动类加载器,但是启动类加载器是属于native类型,是用c编写,所以不能直接访问,值为null
        ClassLoader bootClassLoader = parent.getParent();
        System.out.println("parent.getParent() = " + bootClassLoader);

//       通过getResourceAsStream方法可以从ClassPath中获取相对配置文件的路径,也是项目中找配置文件的标准用法
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("config.properties");

    }
}
