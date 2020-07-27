package com.fd.javabase.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试在大数据量情况下,ArrayList的新增不一定比LinkedList慢
 */
public class ListTest {
    @Test
    public void test() throws Exception{
        List list = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_0000; i++) {
            list.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();

        System.out.println("ArrayList新增的时间是"+(end-start));

         start = System.currentTimeMillis();


        list = new LinkedList();
        for (int i = 0; i < 100_0000; i++) {
            list.add(String.valueOf(i));
        }
         end=System.currentTimeMillis();

        System.out.println("LinkedList新增的时间是"+(end-start));
    }
}
