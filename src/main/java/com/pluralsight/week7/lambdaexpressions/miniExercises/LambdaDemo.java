package com.pluralsight.week7.lambdaexpressions.miniExercises;

import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = nr -> (int) Math.pow(nr, 2);
        System.out.println(unaryOperator.apply(5));

        // little bit weird exercise: average shown as int
        TriFunction triFunction = (x, y, z) -> (x + y + z) / 3;
        System.out.println(triFunction.apply(1, 2, 3));

        Printer printer = str -> System.out.println(str);
        printer.print("lalala");

        Predicate<String> predicate = str -> str.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("f"));

        processStrings(List.of("bla", "lala", "jaja"), str -> str.startsWith("b"));

        List<Integer> integerList = List.of(2, 4, 5, 6, 7, 8, 22, 34, 56, 75);
        integerList.forEach(nr -> System.out.println(nr));
    }

    public static void processStrings(List<String> stringList, Predicate<String> predicate) {
        for(String s : stringList) {
            System.out.println(predicate.test(s));
        }
    }


}
