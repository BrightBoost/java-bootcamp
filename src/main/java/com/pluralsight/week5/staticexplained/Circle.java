package com.pluralsight.week5.staticexplained;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    // non static
    public double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
