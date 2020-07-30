package com.fd.javabase.nio;

import org.junit.Test;

import java.nio.CharBuffer;

public class BufferTest {
    @Test
    public void testBuffer() throws Exception {
//        1.创建Buffer,默认情况下Buffer只能工厂方法获取,不能使用new关键字
        CharBuffer charBuffer = CharBuffer.allocate(10);

        // 通过打印初始化的Buffer的属性可以确定:默认Buffer是写模式
        System.out.println("初始化");
        System.out.println("charBuffer.capacity() = " + charBuffer.capacity());
        System.out.println("charBuffer.limit() = " + charBuffer.limit());
        System.out.println("charBuffer.position() = " + charBuffer.position());

//      2. 往Buffer中写数据,然后打印各个属性
        charBuffer.put("abcd");
        System.out.println("--------------------------------");
        System.out.println("写入abcd后的各个属性的数据 ");
        System.out.println("charBuffer.capacity() = " + charBuffer.capacity());
        System.out.println("charBuffer.limit() = " + charBuffer.limit());
        System.out.println("charBuffer.position() = " + charBuffer.position());
    }
}
