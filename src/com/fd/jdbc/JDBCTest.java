package com.fd.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest {
    @Test
    public void testConnection() throws Exception{
//        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

//        2.得到连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1833", "root", "");
        System.out.println("connection = " + connection);

//       3.得到执行Sql的statement
        Statement statement = connection.createStatement();


    }
}
