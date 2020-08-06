package com.fd.javabase.designpattern.observer;

public class NetListener implements Listener {
    @Override
    public void update(String message) {
        System.out.println("发送网络通知:--> "+message);
    }
}
