package org.fasttrackit;

import lombok.*;

import java.util.List;


@Data
@MyFirstAnnotation

public class PersonLombok {
    @MyFirstAnnotation(flag = true)
    private final String name;
    private final int age;
    private final String country;

    private final boolean isMarried;
    private final String company;

    @PopulateChild
    private int children = 0;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private boolean youWillNeverSee = false;

    @MyFirstAnnotation
    public void doSomething() {

    }
}
