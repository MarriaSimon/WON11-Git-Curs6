package org.fasttrackit.course13.homework.fasttrackit.curs8.abstractClass;

public abstract class Animal {
    private int weight;
    private int numberOfLegs;
    public abstract String talk();
    public abstract String walk();
    public int getWeight() {
        return weight;
    }

    public int getNumberOfLegs() {
        System.out.println(talk());
        return numberOfLegs;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
