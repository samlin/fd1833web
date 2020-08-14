package com.fd.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JDBCTest {
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
