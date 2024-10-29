package com.pluralsight.week6.sub;

import com.pluralsight.week6.Vehicle;

public class Demo extends Vehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        //int x = v.demo; // not accessible
    }

    public void test() {
        System.out.println(this.demo);
    }
}
