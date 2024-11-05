package com.pluralsight.week7;

public interface Prey {
    void runAndHide();

    default void multiply() {
        System.out.println("x2");
    }
}
