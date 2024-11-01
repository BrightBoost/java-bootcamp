package com.pluralsight.week6.polymorphism.shapes;

public abstract class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public double calculateCircumference() {
        System.out.println("Calc the around");
        return 0;
    }
}
