package com.pluralsight.week7.test;

public interface Cleaner {
     default void print() {
        System.out.println("print clean");
    }
}
