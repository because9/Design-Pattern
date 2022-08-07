package com.factorymethod.demo;

public class Bus implements Transport {
    @Override
    public void deliver() {
        System.out.println("Bus deliver!!!");
    }

}
