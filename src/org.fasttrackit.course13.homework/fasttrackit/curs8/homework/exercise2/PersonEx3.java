package org.fasttrackit.course13.homework.fasttrackit.curs8.homework.exercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonEx3 implements Person {
    // private Person person;
    // public PersonEx3(Person person){
    //    this.person = person;
    // }
    private final String firstName;
    private final String lastName;

    public PersonEx3(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;
        System.out.println("\nPerson's full name is: " + fullName);
        return fullName;
    }

    @Override
    public String getAddress() {
        return getAddress();
    }

    @Override
    public LocalDate getBirthday() {
        LocalDate birthday = LocalDate.of(1989, 3, 29);

        return birthday;
    }

    public LocalDate getDay() {
        LocalDate getDay = LocalDate.now();

        return getDay;
    }

    public long age() {
        LocalDate birthday = getBirthday();
        LocalDate getDay = getDay();
        long years = ChronoUnit.YEARS.between(birthday, getDay);
        System.out.println("Person's age is: " + years);
        return years;

    }
}
