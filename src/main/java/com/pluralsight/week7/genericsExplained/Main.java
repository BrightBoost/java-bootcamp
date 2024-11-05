package com.pluralsight.week7.genericsExplained;

import java.time.LocalDate;
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

        Crate<TinyDog> tinyDogCrate = new Crate<>();
        tinyDogCrate.setCreature(new Chihuahua());

        AnimalCrate animalCrate = new AnimalCrate();

        animalCrate.setCreature(chihuahua);
        animalCrate.setCreature(new Butterfly());

        Box<Laptop> laptopBox = new Box<>(new Laptop());
        Box<Crate<TinyDog>> crateBox = new Box<>(new Crate<>());

        FixedList<Integer> numbers = new FixedList<>(3); numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2); dates.add(LocalDate.now()); dates.add(LocalDate.now());
        //dates.add(15); // this line should fail

    }

    public static <T extends Number> double calcAverage(ArrayList<T> nrs) {
        double sum = 0;
        for(T nr: nrs) {
            sum += nr.doubleValue();
        }
        return sum / nrs.size();
    }
}
