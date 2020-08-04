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

    /**
     * 定义Servlet的声明周期的init方法,但是要注意重写有参的init(ServletConfig config)
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("FdServlet.init");
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
