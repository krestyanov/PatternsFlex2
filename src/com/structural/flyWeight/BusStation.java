package com.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class BusStation {
    private static final Map<String, Bus> buses = new HashMap<>();

    public Bus getBusByNumber(String number) {
        Bus bus = buses.get(number);

        if (bus == null){
            switch (number) {
                case "1":
                    System.out.println("Waiting Bus 1");
                    bus = new Bus1();
                    break;
                case "2":
                    System.out.println("Waiting Bus 2");
                    bus = new Bus2();


            }
            buses.put(number, bus);


        }
        return bus;
    }

}
