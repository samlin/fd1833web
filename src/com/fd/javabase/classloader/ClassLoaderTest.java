package com.fd.javabase.classloader;

import com.fd.javabae.Dog;
import com.fd.javabase.Cat;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

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


        //通过前面的inputstream可以让Properties直接获取配置文件的值,也是项目中标准用法
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String name = properties.getProperty("name");
        System.out.println("name = " + name);

//通过字符串得到Class对象,是框架中用的最多的一种加载Class的方式
        Class<?> aClass = Class.forName(name);
        System.out.println("aClass = " + aClass);

//      newInstance通过Class对象来新建一个对象,代替了new关键字,提高了系统的扩展性,默认调用的是对象的无参构造器,所以当前对象一定要有无参构造器
        Cat o = (Cat)aClass.newInstance();
        o.setName("旺财");
        System.out.println("o = " + o);
    }

    @Test
    public void testClassType() throws Exception {
        //一般通过<类.class>可以获取当前类的class对象,但是我们常见的基本类型和void等,也有它自己的Class对象
        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;
        Class<Boolean> booleanClass = boolean.class;
        Class classClass = Class.class;
        Class<byte[]> aClass = byte[].class;
        Class<byte[][]> aClass1 = byte[][].class;
        System.out.println("integerClass = " + integerClass);
        Class<Void> voidClass1 = void.class;
        System.out.println("void.class = " + voidClass1);
    }

    @Test
    public void testFileds() throws Exception {
        Class<Dog> dogClass = Dog.class;

//        getFields获取当前类和父类中所有public的字段
        Field[] fields = dogClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        //getDeclaredFields获取当前类中所有字段,包括public和private,不能获取父类的
        Field[] declaredFields = dogClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

    }
}
