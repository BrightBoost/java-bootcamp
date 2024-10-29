package com.pluralsight.week6.polymorphism;

public class Cat extends Feline {

    public void eat() {
        System.out.println("cat says: nom nom nom after licking the food to death");
    }
    public void purring() {
        System.out.println("purrrrrrr");
    }
}
