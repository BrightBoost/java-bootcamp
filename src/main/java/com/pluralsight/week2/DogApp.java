package com.pluralsight.week2;

import java.util.Scanner;

public class DogApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // prompt for dog fields
        System.out.println("Dog name?");
        String name = scanner.nextLine();

        System.out.println("Dog breed?");
        String breed = scanner.nextLine();

        System.out.println("Dog age?");
        int age = scanner.nextInt();

        // create a new Dog()
        Dog dog = new Dog();

        // set the fields
        dog.setAge(age);
        dog.setName(name);
        dog.setBreed(breed);

        // display the dog
        System.out.println("Created: " + dog.getName());
    }
}
