package com.fd.jdbc;

import org.junit.Before;
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

    //    把statement抽取成一个字段对象,
    private Statement statement;

    @Test
    public void testConnection() throws Exception {

//      4.执行Sql语句
        int i = statement.executeUpdate("update users set name='zhangsan123' where id=1");

//      5.关闭statement connection
        statement.close();
        connection.close();
    }

    /**
     * 因为每次执行方法时,Statement都不一样,所以每次在做单元测试时候,Statement都要重新构建一个(加上@Before即可)
     * @throws SQLException
     */
    @Before
    public void initStatement() throws SQLException {
        //       3.得到执行Sql的statement
        statement = connection.createStatement();
    }

    /**
     * 把Connection初始化抽取到一个函数中,在类初始化的时候只加载一次
     *
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
