package com.pluralsight.week7.genericsExplained;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Chihuahua chihuahua = new Chihuahua();

        LaptopBag laptopBag = new LaptopBag();
        laptopBag.setContent(laptop);

        TinyDogBag tinyDogBag = new TinyDogBag();
        tinyDogBag.setContent(new Chihuahua());

        ObjectBag objectBag = new ObjectBag();
        objectBag.setContent(chihuahua);
        objectBag.setContent(laptop);

        Bag<Laptop> laptopBag1 = new Bag<>();
        laptopBag1.setContent(laptop);

        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.setContent(chihuahua);

        Crate<Butterfly> butterflyCrate = new Crate<>();
        butterflyCrate.setCreature(new Butterfly());

        AnimalCrate animalCrate = new AnimalCrate();

        animalCrate.setCreature(chihuahua);
        animalCrate.setCreature(new Butterfly());
    }
}
