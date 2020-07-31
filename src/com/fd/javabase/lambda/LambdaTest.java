package com.fd.javabase.lambda;

import org.junit.Test;

public class LambdaTest {
    @Test
    public void testLambda() throws Exception{
        //先定义一个匿名类,实现Runnable接口
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名类的执行");
            }
        };

//        调用匿名类的对象的run方法
        runnable.run();
    }
}
