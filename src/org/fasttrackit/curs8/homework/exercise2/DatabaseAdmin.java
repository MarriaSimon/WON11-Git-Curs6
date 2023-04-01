package org.fasttrackit.curs8.homework.exercise2;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    public DatabaseAdmin(String getFirstName, String getLastName, String getAddress) {
        super(getFirstName, getLastName, getAddress);

    }

    @Override
    public LocalDate getBirthday() {
        LocalDate birthday = LocalDate.of(1992, 4, 15);

        System.out.println("Employee's Date of Birth: " + birthday);
        return birthday;
    }

    @Override
    public LocalDate dateOfEmployment() {
        LocalDate employmentDate = LocalDate.of(2022, 10, 13);

        System.out.println("Employee's Date of Employment: " + employmentDate);
        return employmentDate;
    }

    public String getPosition() {
        position = "db admin " + this.position();
        System.out.println("Position: " + position);
        return position;
    }

    public String dbTechnology(String language) {
        System.out.println("Known language : " + language);
        return language;
    }
}
