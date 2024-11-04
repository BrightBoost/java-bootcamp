package com.pluralsight.week7;

public class Cat extends Mammal {
    @Override
    public void eat() {
        System.out.println("cat eats: nom nom nom");
    }

    @Override
    public void breathe() {
        System.out.println("cat breathing");
    }

    public void play() {
        System.out.println("meow");
    }
}
