package com.factorymethod.demo.v2;

public class SeaLogicstics extends LogicsticFactory{
    @Override
    public Transport getTransport() {
        return new Ship();
    }

}
