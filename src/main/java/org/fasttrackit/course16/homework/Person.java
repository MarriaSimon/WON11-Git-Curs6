package org.fasttrackit.course16.homework;

public record Person(String firstName, String lastName, int age, String city ) {
    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String city() {
        return city;
    }
}
