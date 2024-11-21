package com.pluralsight.week7.lambdaexpressions.streams;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> words = List.of("bla", "lala", "coffee");

        String result = words.stream().reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
