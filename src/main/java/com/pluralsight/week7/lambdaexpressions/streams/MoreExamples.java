package com.pluralsight.week7.lambdaexpressions.streams;

import java.util.List;
import java.util.stream.Stream;

public class MoreExamples {
    public static void main(String[] args) {
        Person p1 = new Person("Zia", 1);
        Person p2 = new Person("Lara", 0);
        Person p3 = new Person("Lynn", 5);

        List<Person> personList = List.of(p1, p2, p3);

        personList.stream()
                .sorted()
                //.sorted((person1, person2) -> person1.getAge() - person2.getAge())
                .forEach(s-> System.out.println(s.getName()));
    }
}
