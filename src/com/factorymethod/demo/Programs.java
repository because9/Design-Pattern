package com.factorymethod.demo;

public class Programs {
    private static TypeTransport typeTransport = TypeTransport.BUS;
    public static void main(String... args) {
        /*Transport transport = null;
        switch (typeTransport) {
        case TRUCK:
            transport = new Truck();
            break;
        case SHIP:
            transport = new Ship();
            break;
        case BUS:
            transport = new Bus();
            break;
        default:
            break;
        }
        transport.deliver();*/
        Truck truck = new Truck();
        truck.deliver();
    }
}
