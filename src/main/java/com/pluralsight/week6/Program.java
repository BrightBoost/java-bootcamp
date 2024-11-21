package com.pluralsight.week6;

import com.pluralsight.week2.App;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Car c = new Car("blue", 100, 3);
        c.drive();
        c.honk();

        final Vehicle c1 = new Car("blue", 100, 3);

        if(c1 instanceof Car) {
            ((Car) c1).honk();
        }





    }
}
