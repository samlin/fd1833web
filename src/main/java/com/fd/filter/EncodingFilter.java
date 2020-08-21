package com.fd.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 定义一个基本的Filter,默认实现接口Filter,并且可以实现其中的doFilter方法,
 */
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException {
        System.out.println("EncodingFilter.doFilt    er");

        try {
            servletRequest.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //因为HttpServletRequest方法比较多,一般在过滤器中都要强转
        HttpServletRequest req= (HttpServletRequest) servletRequest;
//        如果当前过滤器检查没问题,那么就默认调 用下一个过滤器,
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义Filter的声明周期的init方法
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("EncodingFilter.init");
    }

    /**
     * 定义Filter的生命周期的destrory方法
     */
    @Override
    public void destroy() {
        System.out.println("EncodingFilter.destroy");

    }
}
