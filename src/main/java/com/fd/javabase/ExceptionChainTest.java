package com.fd.javabase;

import com.fd.javabase.exception.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionChainTest {

    public void testNetwork() throws NetWorkException {
        System.out.println("ExceptionChainTest.testNetwork");
        throw new NetWorkException("老鼠把网线咬断了");
    }

    public void testDBException() throws Exception{
        try {
            testNetwork();
        } catch (NetWorkException e) {
            throw new DBException("数据库出现问题",e);
        }
    }

    public void testMybatis() throws Exception{
        try {
            testDBException();
            return;

        } catch (FileNotFoundException e) {

        } catch (IOException | NullPointerException exception) {
            throw new DAOException("DAO操作出现问题");
        }
    }

    public void testSpring() throws Exception{
        try {
            testMybatis();
        } catch (Exception e) {
            throw new ServiceException("Service操作出现问题",e);
        }
    }
    public void testSpringMVC() throws Exception{
        try {
            testSpring();
        } catch (Exception e) {
            throw new ViewException("不能获取对象,对象为null",e);
        }
    }

    public static void main(String[] args) {
        try {
            new ExceptionChainTest().testSpringMVC();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
