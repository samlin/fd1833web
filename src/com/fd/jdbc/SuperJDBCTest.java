package com.fd.jdbc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SuperJDBCTest {
    //把局部变量抽取成字段变量,方便别的方法也共享conneciton
    private static Connection connection;
    //    把statement抽取成一个字段对象,
    protected Statement statement;

    /**
     * 所有的方法都执行完成,用来关闭Connection
     *
     * @throws SQLException
     */
    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    /**
     * 把Connection初始化抽取到一个函数中,在类初始化的时候只加载一次
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @BeforeClass
    public static void beforeClass() throws ClassNotFoundException, SQLException {
        System.out.println("JDBCTest.beforeClass");
        //        1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

//        2.得到连接对象
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1833", "root", "");
    }

    @After
    public void closeStatement() throws SQLException {
        System.out.println("JDBCTest.closeStatement");
        //      5.关闭statement connection
        statement.close();
    }

    /**
     * 因为每次执行方法时,Statement都不一样,所以每次在做单元测试时候,Statement都要重新构建一个(加上@Before即可)
     *
     * @throws SQLException
     */
    @Before
    public void initStatement() throws SQLException {
        System.out.println("JDBCTest.initStatement");
        //       3.得到执行Sql的statement
        statement = connection.createStatement();
    }

    //通过重构的pull up 把子类的方法推送到父类
    //把执行Sql的代码单独抽取成一个方法,变得通用
    public void executeSql(String sql) throws SQLException {
        statement.executeUpdate(sql);
    }
}
