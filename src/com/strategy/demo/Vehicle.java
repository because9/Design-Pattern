package com.strategy.demo;

public abstract class Vehicle {
    public void buildRoute(String a, String b) {
        System.out.println("Now, I'm driving from " + a + " to " + b);
    }
}
