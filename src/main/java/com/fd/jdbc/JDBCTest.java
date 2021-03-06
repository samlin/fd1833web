package com.fd.jdbc;

import org.junit.*;

import java.sql.*;

/**
 * 通过抽取父类把相同的的代码抽取到父类中,实现模版模式
 */
public class JDBCTest extends SuperJDBCTest {

    @Test
    public void testConnection() throws Exception {
        //通过内联把只用了一次的变量直接传入
        executeSql("update users set name='zhangsan789' where id=1");
    }

    @Test
    public void testPrepareStatement() throws Exception {
        //use preparement
        PreparedStatement preparedStatement = connection.prepareStatement("select id as uid,name uname,email from users where id=? or name=?");
        int index=1;
        preparedStatement.setObject(index++,2);
        preparedStatement.setObject(index++,"zhangsan789");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Object uid = resultSet.getObject("uid");
            Object uname = resultSet.getObject("uname");
            System.out.println("uid = " + uid);
            System.out.println("uname = " + uname);
        }
        preparedStatement.close();
    }

    @Test
    public void testCommit() throws Exception {
        //在JDBC中默认事务是自动提交,如果要测试事务特性,要把自动提交属性设置为false
        connection.setAutoCommit(false);
        try {
            int i = statement.executeUpdate("update users set name='zhangsan777' where id =1");
            int j=1/0;
//          上述代码执行成功则事务提交
            connection.commit();
        } catch (SQLException throwables) {
//            如果发生异常,事务则回滚
            connection.rollback();
        }
    }
}
