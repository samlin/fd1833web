package com.fd.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/writer")
public class WriterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doIt(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doIt(req, resp);
    }

    private void doIt(HttpServletRequest req, HttpServletResponse resp) {
//
        try {
            //如果不用重定向和转发,那么可以直接调用getWriter对象,向浏览器输出页面的代码
            resp.getWriter().println("<html><body> this is out by writer </body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
