package com.strategy.demo;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Helicopter();
        vehicle.buildRoute("HCM", "HN");
    }
}
