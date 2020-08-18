package com.fd.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("GBK");
        System.out.println("Servlet3.doGet");
//        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String gbk = new String(username.getBytes("GBK"), "UTF-8");
        System.out.println("gbk = " + gbk);
        String password = request.getParameter("password");
        System.out.println("password = " + password);
        System.out.println("username = " + username);
    }
}
