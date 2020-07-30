package com.fd.javabase.designpattern;

import org.junit.Test;

import java.io.PrintStream;

public class EatTest {
    /**
     * 如果没有任何参数,默认是吃手抓
     *
     * @throws Exception
     */
    public void eat() throws Exception {
        eat(null);
    }

    /**
     * 如果一个参数,表示用筷子吃饭
     * @param tool
     * @throws Exception
     */
    public void eat(String tool) throws Exception {
        eat(tool,null);
    }
    /**
     * 如果2个参数,表示用刀子,叉子吃饭
     * @param tool
     * @throws Exception
     */
    public void eat(String tool,String toolPar) throws Exception {
        if (toolPar == null) {
            if (tool == null) {
                System.out.println("我是手抓羊肉");
            }
            System.out.println("我吃中餐");
        }
        System.out.println("我吃西餐");
    }
@Test
public void test() throws Exception{
        //定义一个打印流
    PrintStream printStream = new PrintStream( "d:/printStream.txt" );

    //通过setOut让当前System的out类进行重定向,以后所有的往控制台的输出都会重定向到目标流中,也就是说控制台不会再输出
    System.setOut( printStream );

    //默认向控制台打印..
    System.out.println( "printStream = " + printStream );
    System.out.println("我是System打印出来的 ");
}

}
