package com.fd.javabase.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    @Test
    public void testArrayToList() throws Exception{
        //如果使用asList快速得到一个List,那么这个List是只读的,不能添加和删除元素
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.add("4");

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List list1 = list.subList(0, 2);
        list1.add("5");
        list1.remove("2");

        for (Object o : list1) {
            System.out.println("o = " + o);
        }
    }
}
