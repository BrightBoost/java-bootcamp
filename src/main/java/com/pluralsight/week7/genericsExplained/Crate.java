package com.pluralsight.week7.genericsExplained;

public class Crate<T extends Animal> {
    private T creature;
    private double weight;

    public T getCreature() {
        return creature;
    }

    public void setCreature(T creature) {
        this.creature = creature;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
