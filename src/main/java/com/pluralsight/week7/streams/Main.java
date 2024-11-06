package com.pluralsight.week7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> cartoonCharacters = new ArrayList<>();

        cartoonCharacters.add(new Person("Mickey", "Mouse", 92));
        cartoonCharacters.add(new Person("Donald", "Duck", 87));
        cartoonCharacters.add(new Person("Bugs", "Bunny", 83));
        cartoonCharacters.add(new Person("Homer", "Simpson", 39));
        cartoonCharacters.add(new Person("SpongeBob", "SquarePants", 20));
        cartoonCharacters.add(new Person("Daffy", "Duck", 84));
        cartoonCharacters.add(new Person("Bart", "Simpson", 10));
        cartoonCharacters.add(new Person("Tom", "Cat", 80));
        cartoonCharacters.add(new Person("Jerry", "Mouse", 80));
        cartoonCharacters.add(new Person("Fred", "Flintstone", 42));

        List<Person> cartoonMatches = findPerson(cartoonCharacters);
        for(Person cartoon : cartoonMatches) {
            System.out.println(cartoon);
        }

        cartoonMatches.stream().forEach(p -> System.out.println(p));


        // calc average age
        double totalAge = 0;
        for(Person cartoon : cartoonCharacters) {
            totalAge += cartoon.getAge();
        }
        double avgAge = totalAge / cartoonCharacters.size();
        System.out.println("Avg age: " + avgAge);




        // display oldest
        int oldest = cartoonCharacters.get(0).getAge();
        for(Person cartoon : cartoonCharacters) {
            if(cartoon.getAge() > oldest) {
                oldest = cartoon.getAge();
            }
        }
        System.out.println(oldest);



        // display youngest
        int youngest = cartoonCharacters.get(0).getAge();
        for(Person cartoon : cartoonCharacters) {
            if(cartoon.getAge() < youngest) {
                youngest = cartoon.getAge();
            }
        }
        System.out.println(youngest);
    }

    public static List<Person> findPerson(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What name?");
        String name = scanner.nextLine();

        //List<Person> matches = people.stream()
        // .filter(p -> p.getLastName().contains(name) || p.getFirstName().contains(name))
        // .toList();

        List<Person> matches = new ArrayList<>();

        for(Person p: people) {
            if(p.getFirstName().contains(name) || p.getLastName().contains(name)) {
               matches.add(p);
            }
        }
        return matches;
    }
}
