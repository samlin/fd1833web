package com.fd.javabae;

public class Dog extends Animal {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed;

    @Override
    public void run() {

    }
}
