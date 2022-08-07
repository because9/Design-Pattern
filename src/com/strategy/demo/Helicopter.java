package com.strategy.demo;

public class Helicopter extends Vehicle {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Now i'm flying from " + a + " to " + b);
    }
}
