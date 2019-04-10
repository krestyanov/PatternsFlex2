package com.structural.proxy;

public class Proxy implements Game {
    private String disk;
    private RealGame realGame;

    public Proxy(String disk) {
        this.disk = disk;
    }

    @Override
    public void install() {
        if (realGame == null) {
            realGame = new RealGame(disk);
        }

        realGame.install();

    }
}
