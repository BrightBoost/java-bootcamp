package com.pluralsight.week7.genericsExplained;

public class Tester <T, U> {
    private T firstElement;
    private U secondElement;

    public Tester(T firstElement, U secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public U getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(U secondElement) {
        this.secondElement = secondElement;
    }

    public void printFirstElement() {
        System.out.println(firstElement);
    }

    public void printSecondElement() {
        System.out.println(secondElement);
    }
}
