package com.strategy.demo.v2;

public class Bus extends Vehicle {
    public Bus() {
        setStrategy(new PublicTransportStrategy());
    }
}