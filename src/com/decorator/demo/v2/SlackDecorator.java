package com.decorator.demo.v2;

public class SlackDecorator extends BaseDecorator {

    Notifier notifier;

    public SlackDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("Send from slack");
    }
}
