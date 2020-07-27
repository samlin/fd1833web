package com.fd.javabase;

import org.junit.Test;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Random;

public class FDTest {
    public static void main(String[] args) {
        Animal.FDCat fdCat=new Animal().new FDCat();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            System.out.println("random = " + random.nextInt());
        }
    }

    @Test
    public void testProerties() throws Exception {
        Properties properties = System.getProperties();
        Collection<Object> values = properties.values();
        Enumeration<Object> keys = properties.keys();
        for (Object value : values) {
            System.out.println("value = " + value);
        }

        Runnable runnable=new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    @Test
    public void testA() throws Exception{
        try {
            int i=1;
            testB();
            System.exit(0);
        } catch (Exception e) {
            throw new Exception();
        } finally {
            //除了jvm退出以外,所有代码执行完都必须执行的地方.
        }
    }

    private void testB() {
        Integer integer=null;
        if (integer == null) {
            String s = integer.toString();
        }
    }
}
