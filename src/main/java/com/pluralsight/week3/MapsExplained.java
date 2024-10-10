package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExplained {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        groceries.add("bananas");
        groceries.add("eggs");

        Map<String, Integer> groceriesWithQuantities = new HashMap<>();
        // adding is done with put
        groceriesWithQuantities.put("bananas", 7);
        groceriesWithQuantities.put("eggs", 12);
        System.out.println(groceriesWithQuantities);

        // use the key to get the value
        int nrOfBananas = groceriesWithQuantities.get("bananas");
        System.out.println(nrOfBananas);

        groceriesWithQuantities.put("bananas", 12);
        System.out.println(groceriesWithQuantities);
        nrOfBananas = groceriesWithQuantities.get("bananas");
        System.out.println(nrOfBananas);

        // delete
        groceriesWithQuantities.remove("bananas");

        // slightly more complicated map
        List<String> bucketListItemsGabe = new ArrayList<>();
        bucketListItemsGabe.add("Travel the world");
        bucketListItemsGabe.add("Own at least an acre of land");
        bucketListItemsGabe.add("Becoming the best at rocket league ever");

        List<String> bucketListItemsGrecia = new ArrayList<>();
        bucketListItemsGrecia.add("Own a house in couple of cities in the bay area");
        bucketListItemsGrecia.add("Vacation home in lake tahoe");

        Map<String, List<String>> bucketListForPerson = new HashMap<>();
        bucketListForPerson.put("Gabe", bucketListItemsGabe);
        bucketListForPerson.put("Grecia", bucketListItemsGrecia);
        System.out.println(bucketListForPerson);


    }
}
