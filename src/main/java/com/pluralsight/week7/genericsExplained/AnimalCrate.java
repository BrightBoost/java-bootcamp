package com.pluralsight.week7.genericsExplained;

public class AnimalCrate {
    private Animal creature;
    private double weight;

    public Animal getCreature() {
        return creature;
    }

    public void setCreature(Animal creature) {
        this.creature = creature;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
