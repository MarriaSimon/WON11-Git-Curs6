package org.homework_curs7.animals;

public class Cat implements Animals {

    @Override
    public String walk() {
        return "cat - walking";
    }

    @Override
    public String talk() {
        return "cat - meow ";
    }

    @Override
    public String eat() {
        return "cat - eating";
    }
}
