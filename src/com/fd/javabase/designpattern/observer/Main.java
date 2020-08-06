package com.fd.javabase.designpattern.observer;

public class Main {
    public static void main(String[] args) throws Exception {
//        1. 先定义一个主题对象
        Subject subject=new Subject();

//        2. 再定义多个观察者对象
        Listener iPhoneObserver=new IPhoneListener();
        Listener tvObserver=new TvListener();
        Listener netObserver=new NetListener();

        //3. 把定义的观察者加入到主题中(被观察者)
        subject.addListener(iPhoneObserver);
        subject.addListener(tvObserver);
        subject.addListener(netObserver);

//       4.当1发生变化时,把所有的消息都通知给多
        subject.updateAll("下雨了,打雷了,回家收衣服了");
    }
}
