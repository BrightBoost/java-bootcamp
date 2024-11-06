package com.pluralsight.week7.lambdaexpressions.streams.exercises;

import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> strings = List.of("blabla", "lala", "blablabla", "lalalala");
        List<String> uppercaseStringsBiggerThan5 = strings.stream()
                .filter(str -> str.length() >= 6)
                .map(str -> str.toUpperCase())
                .toList();
        System.out.println(uppercaseStringsBiggerThan5);

        for (String s : strings) {
            System.out.println(s);
        }

        strings.forEach(s -> System.out.println(s));

        System.out.println("-----");

        strings.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}
