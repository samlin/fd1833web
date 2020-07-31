package com.fd.javabase.lambda;

/**
 * 用注解@FuncationalInterface可以校验当前接口是否是函数式接口(在接口中只有一个方法)
 */
@FunctionalInterface
public interface FDInterface {
    void exe();
}
