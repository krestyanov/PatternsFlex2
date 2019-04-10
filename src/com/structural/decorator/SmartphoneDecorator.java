package com.structural.decorator;

public class SmartphoneDecorator implements Smartphone {

    Smartphone smartphone;

    public SmartphoneDecorator(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String thing() {
        return smartphone.thing();
    }
}
