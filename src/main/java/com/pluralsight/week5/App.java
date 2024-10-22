package com.pluralsight.week5;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Genald", 25);
        Person p2 = new Person();
        Person p3 = new Person("Gabe");
        p.greet("Grecia");
        System.out.println(p.toString());

    }
}
