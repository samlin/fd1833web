package com.fd.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JDBCTest {
    /**
     * @BeforeClass 在当前所有的单元测试执行之前只执行一次
     * @throws Exception
     */
    @BeforeClass
    public static void beforeClass() throws Exception{
        System.out.println("JDBCTest.beforeClass>>>>>>>>>>>>>>>>");
    }

    /**
     * @Before是每次单元测试之前都要执行一次
     */
    @Before
    public void before() throws Exception{
        System.out.println("JDBCTest.before---------");
    }
    @Test
    public void test() throws Exception {
        System.out.println("JDBCTest.test");
    }
    @Test
    public void testA() throws Exception{
        System.out.println("JDBCTest.testA");
    }
    @Test
    public void testC() throws Exception{
        System.out.println("JDBCTest.testC");
    }
    @After
    public void after() throws Exception{
        System.out.println("JDBCTest.after*************");
    }
}
