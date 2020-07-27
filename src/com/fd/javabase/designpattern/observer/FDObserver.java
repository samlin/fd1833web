package com.fd.javabase.designpattern.observer;

/**
 * 定义多方的观察者,因为实现有多个,所以不能是普通类,必须是接口
 */
public interface FDObserver {
    void update(String message);
}
