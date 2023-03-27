package org.fastrackit.curs8.homework.exercise2;

import java.time.LocalDate;
import java.time.*;

public class DatabaseAdmin extends Employee {
    public DatabaseAdmin(String getFirstName, String getLastName, String getAddress) {
        super(getFirstName, getLastName, getAddress);
        setPosition();
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

    public String setPosition() {
       position = "db admin " + position;
        System.out.println("Position: " + position);
        return super.position();
    }

    public String dbTechnology(String language) {
        System.out.println("Known language : " + language);
        return language;
    }
}
