package com.pluralsight.week6.polymorphism;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() throws AccidentallyAteOwnerException  {
        System.out.println("animal eating");
    }

    public void breathe() {

    }
}
