package com.pluralsight.week6.polymorphism;

import java.io.IOException;
import java.io.ObjectStreamException;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("dog: bite swallow gone");
    }
    public void bark() {
        System.out.println("woof woof");
    }
}
