package com.fd.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 定义一个Servlet规范的ServletContext监听器,默认实现观察者模式,每个监听器等价于观察者模式中的观察者(也就是一对多中的多)
 */
public class SpringServletContentListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SpringServletContentListener.contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("SpringServletContentListener.contextDestroyed");
    }
}
