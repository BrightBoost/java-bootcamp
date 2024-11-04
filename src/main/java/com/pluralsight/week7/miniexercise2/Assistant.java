package com.pluralsight.week7.miniexercise2;

public class Assistant extends ParttimeEmployee implements Promotable {
    @Override
    public void promote() {
        System.out.println("Assistant promoted to lead assistant");
    }

    @Override
    public double getSalary() {
        setSalary(getSalary() + 100);
        return getSalary();
    }
}
