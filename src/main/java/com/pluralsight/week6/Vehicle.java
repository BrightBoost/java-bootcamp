package com.pluralsight.week6;

public class Vehicle {
    private String color;
    private int maxSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }

    public void brake() {
        System.out.println("Vehicle is braking");
    }
}
