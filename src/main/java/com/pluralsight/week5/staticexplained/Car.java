package com.pluralsight.week5.staticexplained;

public class Car {
    private String make;
    private String model;
    private String color;
    private int hp;
    private static int totalNrOfCars;
    private static int totalNrOfMazdas;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
