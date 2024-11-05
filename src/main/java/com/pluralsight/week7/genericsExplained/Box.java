package com.pluralsight.week7.genericsExplained;

public class Box <T>{
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void printContent() {
        System.out.println(content);
    }
}
