package com.fd.javabase.nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

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

//        创建直接缓存区,是跳过JVM直接从操作系统中获得内存,性能比较高,但因为不受JVM的控制,安全性比较低
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(1024);
    }

    @Test
    public void testChannel() throws Exception {
        InputStream inputStream=null;

        //默认FileChannel不能用new 关键字,而要使用功能FileInputStream来构建,不是InputStream
        FileInputStream fileInputStream = new FileInputStream("d:/printStream.txt");
        FileChannel inChannel = fileInputStream.getChannel();

        //构建目标输出Channel
        FileOutputStream fileOutputStream = new FileOutputStream("d:/out.txt");
        FileChannel outChannel = fileOutputStream.getChannel();

        //定义一个Buffer方便用Channel进行文件复制
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (inChannel.read(byteBuffer) != -1) {
//            切换为读模式,从buffer读取数据出来写到输出Channel中
            byteBuffer.flip();

//            从Buffer中读取数据出来,写入目标Channel
            outChannel.write(byteBuffer);

            //每次从Buffer读取完数据后,默认要清理原有buffer数据,下次从0开始读取
            byteBuffer.clear();

        }

//        关闭Channel
        inChannel.close();
        outChannel.close();
    }
}
