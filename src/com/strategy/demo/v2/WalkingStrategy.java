package com.strategy.demo.v2;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Now I'm walking from " + a + " to " + b);
    }

}
