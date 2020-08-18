package com.fd.javabase.designpattern.observer;

public class IPhoneListener implements Listener {
    @Override
    public void update(String message) {
        System.out.println("发送手机通知:--> "+message);
    }
}
