package com.pluralsight.week7.lambdaexpressions.streams;

import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream()
                .filter(nr -> nr % 2 == 0)
                .forEach(nr -> System.out.println(nr));

        for(int x : list) {
            if(x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
