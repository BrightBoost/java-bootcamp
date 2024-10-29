package com.pluralsight.week6.polymorphism;

public class Feline extends Animal {

    @Override
    public void eat() throws AccidentallyAteOwnerException {
        System.out.println("feline nom nom nom");
    }
    public void tripOfCatnip() {
        System.out.println("Feline spacing out");
    }
    public void landOnFeet() {
        System.out.println("Taaadaa landed on my feet");
    }


}
