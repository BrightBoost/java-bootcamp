package com.pluralsight.week6;

public class Car extends Vehicle {

    public Car(String color, int maxSpeed, int demo) {
        super();
       //super(color, maxSpeed, demo);
    }
    public void honk() {
        System.out.println("toot toot");
    }
}
