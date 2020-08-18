package com.fd.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doIt(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doIt(req, resp);
    }

    private void doIt(HttpServletRequest req, HttpServletResponse resp) {
//        演示重定向
        System.out.println("ForwardServlet.doIt");


        try {
//            resp.sendRedirect("http://www.baidu.com");
            //在重定向时,/代表整个http协议的跟路径,不是当前项目的跟路径,当前项目跟路径一般会丢失
            resp.sendRedirect("/WEB-INF/forward.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
