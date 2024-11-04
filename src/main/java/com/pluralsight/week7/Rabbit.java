package com.pluralsight.week7;

public class Rabbit extends Mammal implements Prey {
    @Override
    public void eat() {
        System.out.println("chipchipchip");
    }

    @Override
    public void breathe() {
        System.out.println("snifsnif");
    }


    @Override
    public void runAndHide() {
        System.out.println(getName() + " runs and hides");
    }
}
