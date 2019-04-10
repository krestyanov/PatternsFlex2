package com.structural.bridge;

public class System2 extends Program {
    protected System2(Developer developer) {
        super(developer);
    }

    @Override
    public void developeProgram() {
        System.out.println("System2 is developing ");
        developer.writeCode();

    }
}
