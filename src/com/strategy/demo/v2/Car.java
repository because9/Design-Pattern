package com.strategy.demo.v2;

public class Car extends Vehicle {
    public Car() {
        setStrategy(new RoadStrategy());
    }
}
