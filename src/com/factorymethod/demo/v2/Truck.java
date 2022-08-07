package com.factorymethod.demo.v2;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Road deliver!!!");
    }
}
