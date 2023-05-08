package org.fasttrackit.course13.homework.homework_curs7.animals;

public class Mouse implements Animals {
    @Override
    public String walk() {
        return "Mouse - walking";
    }

    @Override
    public String talk() {
        return "Mouse - gnawing";
    }

    @Override
    public String eat() {
        return "Mouse - eating";
    }
}
