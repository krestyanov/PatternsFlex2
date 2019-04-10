package com.structural.proxy;

public class RealGame implements Game {

    private String gameDisk;

    public RealGame(String gameDisk) {
        this.gameDisk = gameDisk;
        copy();
    }

    public void copy(){
        System.out.println("Copying Game from Disk ");
    }


    @Override
    public void install() {
        System.out.println("Installing game ");

    }
}
