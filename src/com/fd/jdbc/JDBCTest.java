package com.fd.jdbc;

import org.junit.Test;

public class JDBCTest {
    @Test
    public void testConnection() throws Exception{
//        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
    }
}
