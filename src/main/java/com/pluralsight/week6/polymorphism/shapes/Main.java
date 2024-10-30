package com.pluralsight.week6.polymorphism.shapes;

import com.pluralsight.week3.searchinventorymap.Product;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Square(4);
        Shape s3 = new Circle(4);

        System.out.println(s2.calculateArea());

        // casting like this you need to be sure
        // if it fails: class cast exception
        System.out.println(((Circle) s3).getRadius());

        // safer
        if(s3 instanceof Circle c) {
            System.out.println(c.getRadius());
        } else {
            System.out.println("Im not a circle");
        }

        System.out.println(s2.getClass().getSimpleName());


    }
}
