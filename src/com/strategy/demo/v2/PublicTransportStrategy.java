package com.strategy.demo.v2;

public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Now, im go by bus from " + a + " to " + b);
    }

}
