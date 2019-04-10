package com.structural.decorator;

public class Iphone extends SmartphoneDecorator {
    public Iphone(Smartphone smartphone) {
        super(smartphone);
    }


    public String showVideo()

    {
        return " Show video";

    }

    @Override
    public String thing() {
        return super.thing() + showVideo();
    }
}
