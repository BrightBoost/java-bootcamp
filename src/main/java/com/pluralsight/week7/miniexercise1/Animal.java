package com.pluralsight.week7.miniexercise1;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("nom nom");
    }

    public void breathe() {
        System.out.println("breathe in and out");
    }
}
