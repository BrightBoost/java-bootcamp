package com.pluralsight.week7.genericsExplained;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items = new ArrayList<>();
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<T> getItems() {
        return List.copyOf(items);
    }

    public void add(T item) {
        if(items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("Exceeding maxsize! Cannot add");
        }
    }
}
