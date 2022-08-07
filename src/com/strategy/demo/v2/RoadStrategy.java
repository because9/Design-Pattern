package com.strategy.demo.v2;

public class RoadStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Now, I'm driving from " + a + " to " + b);
    }

}
