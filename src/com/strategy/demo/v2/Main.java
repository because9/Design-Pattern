package com.strategy.demo.v2;

public class Main {
    private static String transportType = "HELICOPTER";

    public static void main(String... args) {
        Vehicle vehicle = null;
        // Client creates different strategies based on input from user,
        // application configuration, etc.
        if (transportType.equals("CAR")) {
            vehicle = new Car();
        } else if (transportType.equals("HELICOPTER")) {
            vehicle = new Bus();
        }
        vehicle.buildRoute("HCM", "HN");
    }
}
