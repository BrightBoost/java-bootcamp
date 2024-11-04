package com.pluralsight.week7.miniexercise1;

public abstract class Bird extends Animal implements Flyable {
    public void sing() {
        System.out.println("tweet tweet");
    }
}
