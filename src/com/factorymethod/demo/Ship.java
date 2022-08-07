package com.factorymethod.demo;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship deliver!!!");
    }
}
