package com.pluralsight.week2;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Lara", "European short hair", LocalDate.now().minusWeeks(4), "blue");
//        cat1.setName("Lara");
//        cat1.setBreed("European shorthair"); ;
//        cat1.setDob(LocalDate.now().minusWeeks(4));
//        cat1.setColor("blue");

        cat1.sayMeow();

        CatOwner catOwner = new CatOwner();
        catOwner.setName("Maaike");
        catOwner.setCat(cat1);

        System.out.println(catOwner.getCat().getColor().startsWith("b"));


//        Cat cat2 = new Cat();
//        cat2.name = "Lynn";
//        cat2.breed = "European shorthair";
//        cat2.dob = LocalDate.now().minusWeeks(4);
//        cat2.color = "blue mix";
//
//        Cat cat3 = new Cat();
//        cat3.name = "Zia";
//        cat3.breed = "Brittish shorthair";
//        cat3.dob = LocalDate.now().minusYears(1);
//        cat3.color = "lilac";

        System.out.println("Cat: " + cat1.getName() + " breed " + cat1.getBreed() + " and color " + cat1.getColor() + " born on " + cat1.getDob());
//        System.out.println("Cat: " + cat2.name + " breed " + cat2.breed + " and color " + cat2.color + " born on " + cat2.dob);
//        System.out.println("Cat: " + cat3.name + " breed " + cat3.breed + " and color " + cat3.color + " born on " + cat3.dob);
    }
}
