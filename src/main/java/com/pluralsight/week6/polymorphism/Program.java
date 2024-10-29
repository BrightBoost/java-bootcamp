package com.pluralsight.week6.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Animal zia1 = new Cat();
        Feline zia2 = new Cat();
        Cat zia3 = new Cat();
        Object zia4 = new Cat();


        try {
            zia1.eat();

           // zia2.eat();
        } catch (AccidentallyAteOwnerException e) {
            throw new RuntimeException(e);
        }

        Dog wiesje = new Dog();

        List<Animal> animals = new ArrayList<>();
        animals.add(zia3);
        animals.add(zia1);
        animals.add(wiesje);

        Animal onList = animals.get(2);
        if(onList instanceof Dog dog) {
            dog.bark();


        }

    }
}
