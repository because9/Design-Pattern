package com.decorator.demo.v2;

public class FacebookDecorator extends BaseDecorator {
    Notifier notifier;

    public FacebookDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("Send from facebook");
    }

}
