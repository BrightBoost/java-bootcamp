package com.pluralsight.week7.miniexercise1;

public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Eagle();
        flyable.fly();
        flyable.sing();
        Eagle e = new Eagle();
        e.fly();
    }
}