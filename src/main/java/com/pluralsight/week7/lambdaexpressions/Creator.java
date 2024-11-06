package com.pluralsight.week7.lambdaexpressions;

@FunctionalInterface
public interface Creator<T> {
    T create();
}
