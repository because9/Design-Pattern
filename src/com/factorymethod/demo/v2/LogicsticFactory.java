package com.factorymethod.demo.v2;

public abstract class LogicsticFactory {
    public abstract Transport getTransport();

    public void deliver() {
        Transport transport = getTransport();
        transport.deliver();
    }
    private static LogicsticFactory logicstics;
    public static LogicsticFactory getInstance(TypeLogicstics type) {
        switch (type) {
        case ROAD:
            logicstics = new RoadLogicstics();
            break;
        case SEA:
            logicstics = new SeaLogicstics();
            break;
        default:
            break;
        }
        return logicstics;
    }
}

enum TypeLogicstics {
    ROAD, SEA
}
