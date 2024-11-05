package com.pluralsight.week7.test;

public interface Movable {
    default void print() {
        System.out.println("move print");
    }
}
