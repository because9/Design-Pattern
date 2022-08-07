package com.factorymethod.demo.v2;

public class RoadLogicstics extends LogicsticFactory{

    @Override
    public Transport getTransport() {
        return new Truck();
    }

}
