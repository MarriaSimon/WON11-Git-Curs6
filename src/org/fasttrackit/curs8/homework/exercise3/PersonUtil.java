package org.fasttrackit.curs8.homework.exercise3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonUtil {
    private Peerson person;

    public PersonUtil(Peerson person) {
        this.person = person;
    }

    public String getFullName() {
        String fullName1 = person.getFirstName() + " " + person.getLastName();
        String fullName2 = String.format("%s %s", person.getFirstName(), person.getLastName());
        String fullName3 = new StringBuilder().append(person.getFirstName()).append(" ").append(person.getLastName()).toString();
        return fullName1;
    }

    public int getAge() {
        LocalDate birthDate = person.getBirthDate();
        LocalDate now = LocalDate.now();
        boolean hasPassed = now.getMonthValue() > birthDate.getMonthValue() || (now.getMonthValue() == birthDate.getMonthValue() && now.getDayOfMonth() > birthDate.getDayOfMonth());
        boolean hasPassed2 = now.getDayOfYear() > birthDate.getDayOfYear();
        return now.getYear() - birthDate.getYear() - (hasPassed2 ? 0 : 1);
    }

    public int getAge2() {
        return (int) ChronoUnit.YEARS.between(person.getBirthDate(), LocalDate.now());
    }

    public static void main(String[] args) {
        Employeee employee = new Employeee();
        employee.setBirthDate(LocalDate.of(2003, 1, 10));

        PersonUtil personUtil = new PersonUtil(employee);

        System.out.println(personUtil.getAge2());

        Object obj = new Employeee();
        if (obj instanceof Employeee) {
            System.out.println("is Employee");
        }
    }
}

