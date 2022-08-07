package com.decorator.demo.v2;

public class Main {
    private static boolean facebookEnabled = true;
    private static boolean mailEnabled = true;
    private static boolean slackEnabled = true;

    public static void main(String[] args) {
        BaseDecorator stack = new BaseDecorator();
        if (facebookEnabled) {
            stack = new FacebookDecorator(stack);
        }
        if (mailEnabled) {
            stack = new MailDecorator(stack);
        }
        if (slackEnabled) {
            stack = new SlackDecorator(stack);
        }
        stack.send();
    }
}
