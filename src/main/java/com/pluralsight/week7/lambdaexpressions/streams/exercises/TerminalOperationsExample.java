package com.pluralsight.week7.lambdaexpressions.streams.exercises;

import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long nrOfEvenNumbers = integerList.stream()
                .filter(nr -> nr % 2 == 0)
                .count();

    }
}
