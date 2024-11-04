package com.pluralsight.week7.miniexercise1;

public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
