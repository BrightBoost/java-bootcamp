package com.pluralsight.week5.staticexplained;

public class App {
    public static void main(String[] args) {
        // non static, I need instances
        Circle c1 = new Circle(5);
        System.out.println(c1.calcArea());

        Circle c2 = new Circle(15);
        System.out.println(c2.calcArea());

        // static no instances required
        System.out.println(MathUtils.calcAreaCircle(40));
    }
}
