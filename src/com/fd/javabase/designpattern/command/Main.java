package com.fd.javabase.designpattern.command;

public class Main {
    public  static void main(String[] args) {
        TV tv =new TV();

        Command on = new OnCommand(tv);
        Command off = new OffCommand(tv);
        Command start = new StartCommand(tv);

//        通过命令模式来操作电视
        on.execute();
        off.execute();
        start.execute();
    }
}
