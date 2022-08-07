package com.decorator.demo.v2;

public class BaseDecorator implements Notifier {

    @Override
    public void send() {
        System.out.println("This method execute very much code");
    }

}
