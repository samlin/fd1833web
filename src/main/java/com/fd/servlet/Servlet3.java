package com.fd.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.InputStream;
@WebServlet("/s3")
public class Servlet3 extends javax.servlet.http.HttpServlet {
    /**
     * 定义Servlet的构造器
     */
    public Servlet3() {
        System.out.println("Servlet3.Servlet3");
    }

    /**
     * 定义Servlet的声明周期的init方法,但是要注意重写有参的init(ServletConfig config)
     * 经过测试,启动tomcat时,,默认没有加载Servlet的初始化方法
     * 默认在第一次请求Servlet时候,Servlet才先调用构造器,再调用init方法,最后调用service方法的实现doGet或doPost
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet3.init");
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet3.doPost");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet3.doGet");
    }

    /**
     * 定义了Servlet生命周期中的销毁方法
     * 当在关闭服务器的时候,默认调用destory方法
     */
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet3.destroy");
    }
}
