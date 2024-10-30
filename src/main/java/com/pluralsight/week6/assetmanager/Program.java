package com.pluralsight.week6.assetmanager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House house1 = new House("main house", "today", 1_000_000, "main street 1", 2, 500, 1000);
        House house2 = new House("vacation house", "today", 500_000, "main street 2", 1, 200, 400);
        Vehicle vehicle1 = new Vehicle("regular car", "yesterday", 20000, "Peugeot 308", 2022, 30000);
        Vehicle vehicle2 = new Vehicle("spare car", "yesterday", 20000, "Toyota Tacoma", 2022, 30000);
        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for(Asset a: assets) {
            System.out.println(a.getDescription() + " - " + a.getDateAcquired() + " : " + a.getOriginalCost() + "  => " + a.getValue());
        }
    }
}
