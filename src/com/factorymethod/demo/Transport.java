package com.factorymethod.demo;

public interface Transport {
    public void deliver();
}

enum TypeTransport {
    TRUCK, SHIP, BUS
}