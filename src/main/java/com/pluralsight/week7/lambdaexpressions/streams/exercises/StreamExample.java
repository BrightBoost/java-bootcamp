package com.pluralsight.week7.lambdaexpressions.streams.exercises;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubleList = integerList.stream()
                .filter(nr -> nr % 2 == 0)
                .map(nr -> Math.pow(nr, 2))
                .toList();
    }
}
