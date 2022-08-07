package com.strategy.demo.v2;

public abstract class Vehicle {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String a, String b) {
        this.strategy.buildRoute(a, b);
    }
}
