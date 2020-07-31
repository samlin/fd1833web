package com.fd.javabase.lambda;

import org.junit.Test;

import java.util.function.Consumer;

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

//        使用Lambda表达式代替匿名类
        Runnable lambda = () ->{System.out.println("我是lambda表达式打印");};
        lambda.run();


    }

    @Test
    public void testFdFunction() throws Exception{
        doit(new FDInterface() {
            @Override
            public void exe() {

            }
        });

        doit(()-> System.out.println("我是lambda的实现"));

    }

    public void doit(FDInterface fdInterface) throws Exception{
        fdInterface.exe();
    }
    @Test
    public void testDoit() throws Exception{
        //演示是使用自定义函数式接口进行lambad表达式传参(传递函数)
        doit(()-> System.out.println("我是lambda的实现"));
    }


    public void justDoIt(Consumer<String> consumer) throws Exception{
        consumer.accept("123");
    }
    @Test
    public void testJustDoIt() throws Exception{
        //用lambda表达式演示通过Consumer接口传递两个代码块,实现两个功能
        justDoIt((x)-> System.out.println(x));

        //如果lambda表达式是一个参数,那么左边参数列表的小括号可以省略
        justDoIt(x-> System.out.println("fd1833"+x));
    }
}
