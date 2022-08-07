package com.factorymethod.demo.v2;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Sea deliver!!!");
    }
}
