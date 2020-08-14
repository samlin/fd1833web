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
        //通过内联把只用了一次的变量直接传入
        executeSql("update users set name='zhangsan789' where id=1");
    }

}
