package com.pluralsight.week5;

import java.util.List;

public class Dog {
    private String name;
    private String sound;
    private String breed;

    public Dog(String name, String sound, String breed) {
        this.name = name;
        this.sound = sound;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // methods
    public void bark() {
        System.out.println(this.name + " says " + this.sound);
    }

    public void walk(String dogWalker) {
        System.out.println(dogWalker + " is walking " + this.name);
    }

    public void walk(List<String> dogWalkers) {
        for(String dogWalker: dogWalkers) {
            walk(dogWalker);
        }
    }

    public void walk(String dogWalker, int nrOfMinutes) {
        System.out.println(dogWalker + " is walking " + this.name + " for " + nrOfMinutes + " minutes.");
    }
}
