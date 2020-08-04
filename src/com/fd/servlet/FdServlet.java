package com.fd.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;

public class FdServlet extends javax.servlet.http.HttpServlet {
    /**
     * 定义Servlet的构造器
     */
    public FdServlet() {
        System.out.println("FdServlet.FdServlet");
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("FdServlet.doPost");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("FdServlet.doGet");
    }
}
