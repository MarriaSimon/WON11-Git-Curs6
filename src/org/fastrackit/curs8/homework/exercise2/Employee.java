package org.fastrackit.curs8.homework.exercise2;

import javax.swing.text.DateFormatter;
import java.util.Date;
import java.time.LocalDate;

public abstract class Employee implements Person {

    private final String firstName;
    private final String lastName;
    private final String address;
    public String position;


    public Employee(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {

        System.out.println("\nEmployee's first name: " + this.firstName);
        return firstName;
    }

    @Override
    public String getLastName() {
        System.out.println("Employee's last name: " + lastName);
        return lastName;
    }

    public String getAddress() {

        System.out.println("Address: " + this.address);
        return address;
    }

    public String position() {
        position = "employee";
        return position;
    }

    public LocalDate getBirthday() {
        return getBirthday();
    }

    public LocalDate dateOfEmployment() {
        return dateOfEmployment();
    }
}


