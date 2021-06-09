package com.company;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal state: " + Integer.toOctalString(subject.getState()));
    }
}
