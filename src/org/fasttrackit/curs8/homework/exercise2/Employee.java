package org.fasttrackit.curs8.homework.exercise2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Person {

    private final String firstName;
    private final String lastName;
    private final String address;
    public String position;
    public LocalDate getBirthDay;


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

    public String toString() {
        return "Employee{" +
                "First name" + firstName + '\'' +
                "Last Name " + lastName + '\'' +
                "adress " + address + '\'' +
                "}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(address, employee.address);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }

  /*  public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            if(getBirthDay() == null)return getBirthday().compareTo(e.getBirthday());
        }
        return 0;
    }

   */
}


