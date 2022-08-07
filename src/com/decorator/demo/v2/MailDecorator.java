package com.decorator.demo.v2;

public class MailDecorator extends BaseDecorator {
    Notifier notifier;

    public MailDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("Send from mail");
    }
}
