package com.fd.javabase.designpattern.proxy;

public class SongProxy implements FDProxy{

    @Override
    public void meet(int money) {
        if (money > 10_0000_0000) {
            LiuDeHua liuDeHua=new LiuDeHua();
            liuDeHua.meet(money);
        } else {
            System.out.println("刘德华出差了,不方便见面");
        }
    }
}
