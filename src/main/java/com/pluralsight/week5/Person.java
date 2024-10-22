package com.pluralsight.week5;

import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method
    // signature is the combination of method name + parameter types
    // greet String
    public void greet(String nameOtherPerson) {
        System.out.println(this.name + " says 'Hi " + nameOtherPerson + "'");
    }

    // greet String String
    public void greet(String nameOfDog, String woof) {

    }

    // greet int String
    public void greet(int x, String z) {

    }

    //greet String int (return type not relevant for overloading)
    public String greet(String z, int x) {
        return "bla";
    }

    // greet List<String>
    public void greet(List<String> namesOtherPersons) {
        for(String name: namesOtherPersons) {
            System.out.println(this.name + " says 'Hi " + name + "'");

        }
    }
}
