package org.fasttrackit.curs8.abstractClass;

public class Cat extends Animal{

    @Override
    public String talk() {
        return "miau";
    }

    @Override
    public String walk() {
        return "cat - walking";
    }
}
