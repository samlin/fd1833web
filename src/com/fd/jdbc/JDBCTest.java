package com.fd.jdbc;

import org.junit.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 通过抽取父类把相同的的代码抽取到父类中,实现模版模式
 */
public class JDBCTest extends SuperJDBCTest {

    @Test
    public void testConnection() throws Exception {
        String sql = "update users set name='zhangsan789' where id=1";
        executeSql(sql);
    }

}
