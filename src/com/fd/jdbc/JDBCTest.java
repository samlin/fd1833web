package com.fd.jdbc;

import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("ALL")
public class JDBCTest {

    //把局部变量抽取成字段变量,方便别的方法也共享conneciton
    private static Connection connection;

    @Test
    public void testConnection() throws Exception{

//       3.得到执行Sql的statement
        Statement statement = connection.createStatement();

//      4.执行Sql语句
        int i = statement.executeUpdate("update users set name='zhangsan' where id=1");

//      5.关闭statement connection
        statement.close();
        connection.close();
    }

    /**
     * 把Connection初始化抽取到一个函数中,在类初始化的时候只加载一次
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @BeforeClass
    public static void beforeClass() throws ClassNotFoundException, SQLException {
        //        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

//        2.得到连接对象
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1833", "root", "");
        System.out.println("connection = " + connection);
    }
}
