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

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("EncodingFilter.init");
    }

    @Override
    public void destroy() {
        System.out.println("EncodingFilter.destroy");

    }
}
