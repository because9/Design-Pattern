package com.factorymethod.demo.v2;

public class Programs {
    public static void main(String... args) {
        LogicsticFactory logicstics = LogicsticFactory.getInstance(TypeLogicstics.ROAD);
        logicstics.deliver();
    }
}