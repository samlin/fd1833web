package com.fd.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doIt(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doIt(req, resp);
    }

    private void doIt(HttpServletRequest req, HttpServletResponse resp) {
        //演示Session的创建,一旦创建,一个会话中多个请求都会共享同一个session
        HttpSession session = req.getSession();
        System.out.println("session = " + session.getId());
        try {
            req.getRequestDispatcher("session.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
