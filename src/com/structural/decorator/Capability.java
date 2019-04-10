package com.structural.decorator;

public class Capability {
    public static void main(String[] args) {
        Smartphone smartphone = new Iphone (new Nokia());

        System.out.println(smartphone.thing());
    }
}
