package com.fd.javabase.designpattern.template;

public abstract class IPhoneTemplate {

/**
 * 定义一个核心的造手机的流程
 */

public void setup() throws Exception{
    setupCpu();
    setupMem();
    if (check()) {
        build();
    }

}

    protected abstract void build();

    protected abstract boolean check();

    protected abstract void setupMem();

    protected abstract void setupCpu();
}
