package com.decorator.demo;

public class Main {

    public static void main(String[] args) {
        Notifier n = new NotifierImpl();
        n.sendMailAndFacebook();
    }

}
