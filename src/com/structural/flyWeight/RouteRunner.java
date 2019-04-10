package com.structural.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class RouteRunner {
    public static void main(String[] args) {
        BusStation busStation = new BusStation();

        List<Bus> buses = new ArrayList<>();

        buses.add(busStation.getBusByNumber("1"));
        buses.add(busStation.getBusByNumber("1"));
        buses.add(busStation.getBusByNumber("1"));
        buses.add(busStation.getBusByNumber("1"));
        buses.add(busStation.getBusByNumber("1"));
        buses.add(busStation.getBusByNumber("2"));
        buses.add(busStation.getBusByNumber("2"));
        buses.add(busStation.getBusByNumber("2"));
        buses.add(busStation.getBusByNumber("2"));

        for (Bus bus: buses){
            bus.passengerTrasportation();
        }



    }
}
