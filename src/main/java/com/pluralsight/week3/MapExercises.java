package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
//        1. Create a map for name of the people your breakout room and their favorite fruit
        Map<String, String> peopleFavoriteFruit = new HashMap<>();
        peopleFavoriteFruit.put("Cesar", "Guava");
        peopleFavoriteFruit.put("Joezari", "Mango");
        peopleFavoriteFruit.put("Grecia", "Banana");
        peopleFavoriteFruit.put("Akbar", "Kiwi");
//        2. Create a map for numbers 1-5 and their squared counter parts (2 and 4, 3 and 9, 4 and 16)
        Map<Integer, Integer> numbersSquared = new HashMap<>();
        numbersSquared.put(1, 1);
        numbersSquared.put(2, 4);
        numbersSquared.put(3, 9);
        numbersSquared.put(4, 16);
        numbersSquared.put(5, 25);
//        3. Create a map for a string owner and a list of puppies he/she owns
        Puppy puppy1 = new Puppy("Clifford", "big red dog");
        Puppy puppy2 = new Puppy("Bob", "beagle");
        Puppy puppy3 = new Puppy("Bonita", "Chihuahua");
        Puppy puppy4 = new Puppy("Supersonic legend", "pitbull");

        List<Puppy> puppies1 = new ArrayList<>();
        puppies1.add(puppy1);
        puppies1.add(puppy2);
        List<Puppy> puppies2 = new ArrayList<>();
        puppies2.add(puppy3);
        puppies2.add(puppy4);

        Map<String, List<Puppy>> ownersPuppies = new HashMap<>();
        ownersPuppies.put("Sameem", puppies1);
        ownersPuppies.put("Gabe", puppies2);

        // iterating is a little different for map
        // why? Well... it's key value pairs
        // three options: values, keys, keyvaluepairs

        // iterate over keys
        for(String person: peopleFavoriteFruit.keySet()) {
            System.out.println(person + " : " + peopleFavoriteFruit.get(person));
        }

        for(int nr: numbersSquared.keySet()) {
            System.out.println(nr);
        }

        for(String owner: ownersPuppies.keySet()){
            System.out.println(owner);
        }

        // iterate over values
        for(String fruit: peopleFavoriteFruit.values()) {
            System.out.println(fruit);
        }

        for(int sqrdNr: numbersSquared.values()) {
            System.out.println(sqrdNr);
        }

        for(List<Puppy> puppies: ownersPuppies.values()){
            System.out.println(puppies);
        }

        // iterate over key value pairs - but you can also just use the key to get the value
        for(Map.Entry<Integer, Integer> pair: numbersSquared.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
