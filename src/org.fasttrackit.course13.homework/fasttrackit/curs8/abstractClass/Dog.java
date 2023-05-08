package org.fasttrackit.course13.homework.fasttrackit.curs8.abstractClass;

public class Dog extends Animal{

    @Override
    public String talk() {
        return "ham -ham";
    }

    @Override
    public String walk() {
        return "dog - walking";
    }
}
