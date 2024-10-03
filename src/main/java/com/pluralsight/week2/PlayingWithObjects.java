package com.pluralsight.week2;

import java.time.LocalDate;

public class PlayingWithObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Zia", "bsh", LocalDate.now().minusYears(1), "lilac");
        Cat cat2 = new Cat("Yves", "Sphynx", LocalDate.now().plusYears(1), "skin");

        CatOwner catOwner = new CatOwner();
        catOwner.setName("Cesar");
        catOwner.setCat(cat2);

        System.out.println(catOwner.getName() +
                " " + catOwner.getCat().getName());

        cat1.setName("Zia");
        cat2.setName("Yves");
        cat2.setBreed("Sphynx");

        System.out.println(catOwner.getName() +
                " " + catOwner.getCat().getName());

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
    }
}
