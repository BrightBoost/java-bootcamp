package com.pluralsight.week7.lambdaexpressions.streams;

import java.util.List;
import java.util.stream.Stream;

public class FinalOperations {
    public static void main(String[] args) {
        List<String> deskThings = List.of("cup", "mug", "another mug", "mouse", "webcam", "laptop");

        long nrOfThingsOnMyDesk = deskThings.stream().count();
        long nrOfThingsWithMoreThan5LettersOnMyDesk = deskThings.stream()
                .filter(deskThing -> deskThing.length() > 5)
                .count();
        System.out.println(nrOfThingsWithMoreThan5LettersOnMyDesk);

        Stream<String> streamThings = deskThings.stream();
        streamThings.forEach(s -> System.out.println(s));
        // streamThings.count(); // exception: stream has already been operated upon or closed
    }
}
