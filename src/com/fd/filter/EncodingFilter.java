package com.fd.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 定义一个基本的Filter,默认实现接口Filter,并且可以实现其中的doFilter方法,
 */
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

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
