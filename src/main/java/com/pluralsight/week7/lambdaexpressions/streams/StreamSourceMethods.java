package com.pluralsight.week7.lambdaexpressions.streams;

import java.util.List;

public class StreamSourceMethods {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(list.parallelStream()
                .filter(nr -> nr % 2 != 0)
                .peek(s -> System.out.println(Thread.currentThread().threadId() + " : " + s))
                .findFirst().get()
        );

        // as soon as java sees there's no final operation
        // it's not even starting the stream
        // lazy evaluation
        list.parallelStream()
                .filter(nr -> nr % 2 != 0)
                .peek(s -> System.out.println("BLABLABLA"));


    }
}
