package org.fasttrackit.curs8.homework.exercise2;

import java.time.*;


public class Programmer extends Employee {
    public Programmer(String getFirstName, String getLastName, String getAddress) {
        super(getFirstName, getLastName, getAddress);
    }

    @Override
    public LocalDate getBirthday() {
        LocalDate birthday = LocalDate.of(1989, 3, 18);

        System.out.println("Employee's Date of Birth: " + birthday);
        return birthday;
    }

    public LocalDate dateOfEmployment() {
        LocalDate employmentDate = LocalDate.of(2021, 8, 11);

        System.out.println("Employee's Date of Employment: " + employmentDate);
        return employmentDate;
    }

    public String getPosition() {
        super.position = "programmer";
        System.out.println("Position: " + position);
        return position;
    }

    public String language(String language) {
        System.out.println("Known programming language : " + language);
        return language;
    }
}
