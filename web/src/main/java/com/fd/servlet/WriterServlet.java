package com.fd.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
        resp.setCharacterEncoding("UTF-8");
        try {
            //如果不用重定向和转发,那么可以直接调用getWriter对象,向浏览器输出页面的代码
            resp.getWriter().println("<html><body> this is out by writer </body></html>");

//            System.out.println("getServletContext().getContextPath() = " + getServtContext().getContextPath());
            System.out.println("123上下文路径req.getContextPath() = " + req.getContextPath());
            String name = req.getParameter("name");
            String age = req.getParameter("age");
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("req.getQueryString() = " + req.getQueryString());

            //getParameterMap可以获取当前请求中所有的参数,但是参数值是String数组的格式,需要转化才可以获取
            Map<String, String[]> parameterMap = req.getParameterMap();
            Set<String> strings = parameterMap.keySet();
            for (String string : strings) {
                System.out.println("key = " + string);
                System.out.println("value = " + Arrays.toString( parameterMap.get(string)));
            }

            String[] names = req.getParameterValues("name");
            for (String s : names) {
                System.out.println("s = " + s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
