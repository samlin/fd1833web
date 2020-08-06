package com.fd.javabase.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义观察者中的一方 也称作主题
 */
public class Subject {
    //在一方定义放置多个观察者的List
    List<Listener> list = new ArrayList<>();

    //    定义一个方法,把观察者加入到主题中(被观察者)
    public void addListener(Listener listener) throws Exception {
        list.add(listener);
    }

//    定义通知的方式,当一发生变化了会通知多
    public void updateAll(String message) throws Exception{
        for (Listener listener : list) {
            listener.update(message);
        }
    }
}
