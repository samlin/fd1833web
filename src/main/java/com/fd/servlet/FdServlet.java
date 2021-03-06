package com.fd.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.InputStream;

public class FdServlet extends javax.servlet.http.HttpServlet {
    /**
     * 定义Servlet的构造器
     */
    public FdServlet() {
        System.out.println("FdServlet.FdServlet");
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
        System.out.println("FdServlet.init");

        //用来获取web.xml中init-param节点定义的变量
        String dbName = config.getInitParameter("dbName");
        System.out.println("dbName = " + dbName);

        //通过全局上下文ServletContext获取全局配置参数
        String password = config.getServletContext().getInitParameter("password");
        System.out.println("password = " + password);

//        //ServletContext().getResourceAsStream 可以直接获取web工程根路径下面的文件的内容
//        InputStream resourceAsStream = config.getServletContext().getResourceAsStream("index.jsp");
//        System.out.println("resourceAsStream = " + resourceAsStream);
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("FdServlet.doPost");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("FdServlet.doGet");
    }

    /**
     * 定义了Servlet生命周期中的销毁方法
     * 当在关闭服务器的时候,默认调用destory方法
     */
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("FdServlet.destroy");
    }
}
