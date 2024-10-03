package com.pluralsight.week2;

import java.time.LocalDate;

public class Cat {
    private String name;
    private String breed;
    private LocalDate dob;
    private String color;

    public Cat(String name, String breed, LocalDate dob, String color) {
        this.name = name;
        this.breed = breed;
        this.dob = dob;
        this.color = color;

        System.out.println("CONSTRUCTING A CAT OBJECT");
    }


    public void sayMeow() {
        System.out.println("مرحبا بالعالم!  " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
