package com.pluralsight.week6.polymorphism.shapes;

public class Square extends Shape {

    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateArea() {
        return sideSize * sideSize;
    }

    @Override
    public double calculateCircumference() {
        return sideSize * 4;
    }
}
