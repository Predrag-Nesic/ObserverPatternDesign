package com.company;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal state: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
