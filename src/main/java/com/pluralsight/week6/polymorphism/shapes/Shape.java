package com.pluralsight.week6.polymorphism.shapes;

public class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        System.out.println("Calc area");
        return 0;
    }

    public double calculateCircumference() {
        System.out.println("Calc the around");
        return 0;
    }
}
