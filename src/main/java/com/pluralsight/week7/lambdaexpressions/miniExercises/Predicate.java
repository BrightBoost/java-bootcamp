package com.pluralsight.week7.lambdaexpressions.miniExercises;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
