package com.fd.javabase.designpattern.command;

public class OnCommand implements Command {
    private final TV tv;
//    定义一个有参构造器,强制在创建遥控器按钮时,必须要先创建电视

    public OnCommand(TV tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
