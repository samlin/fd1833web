package com.fd.javabase.nio;

import org.junit.Test;

import java.nio.ByteBuffer;
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

//      3. 通过flip方法,切换为读模式
        System.out.println("-----------切换为读模式后面的各个属性---------------------");
        charBuffer.flip();
        System.out.println("写入abcd后的各个属性的数据 ");
        System.out.println("charBuffer.capacity() = " + charBuffer.capacity());
        System.out.println("charBuffer.limit() = " + charBuffer.limit());
        System.out.println("charBuffer.position() = " + charBuffer.position());


//      4. 清理Buffer
        System.out.println("-----------调用clear后的属性---------------------");
        charBuffer.clear();
        System.out.println("写入abcd后的各个属性的数据 ");
        System.out.println("charBuffer.capacity() = " + charBuffer.capacity());
        System.out.println("charBuffer.limit() = " + charBuffer.limit());
        System.out.println("charBuffer.position() = " + charBuffer.position());

        charBuffer.put("123");

//       切记,如果put了数据,要读取的时候,一定要通过filp切换为读模式,否则获取的数据为无效数据(缓冲区以前插入的数据)
        charBuffer.flip();
        char c = charBuffer.get();
        System.out.println("c = " + c);

    }

    @Test
    public void testBufferType() throws Exception {
//        创建一个间接缓存区,一般有JVM来控制,安全性比较高,但性能比较低
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
    }
}
