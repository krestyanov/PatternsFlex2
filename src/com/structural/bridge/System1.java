package com.structural.bridge;

public class System1 extends Program {
    protected System1(Developer developer) {
        super(developer);
    }

    @Override
    public void developeProgram() {
        System.out.println("System1 is developing ");
        developer.writeCode();

    }
}
