package com.fd.javabase.designpattern.observer;

public class TvObserver implements FDObserver{
    @Override
    public void update(String message) {
        System.out.println("电视发送通知:--> "+message);
    }
}
