package com.fd.javabase.nio;

import org.junit.Test;

import java.nio.CharBuffer;

public class BufferTest {
    @Test
    public void testBuffer() throws Exception {
//        1.创建Buffer,默认情况下Buffer只能工厂方法获取,不能使用new关键字
        CharBuffer charBuffer = CharBuffer.allocate(10);
    }
}
