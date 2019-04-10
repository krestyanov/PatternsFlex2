package com.structural.proxy;

public class GameInstaller {
    public static void main(String[] args) {
        Game game = new Proxy("C:/MyComputer/DiskDrive1 ");

        game.install();
    }
}
