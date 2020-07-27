package com.fd.javabase.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        FDProxy proxy=new SongProxy();
        proxy.meet(2000000000);
    }
}
