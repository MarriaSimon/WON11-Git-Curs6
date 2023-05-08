package org.fasttrackit.course13.homework.fasttrackit.curs9.homework_curs9.exercise3;

import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
        Person manager = company.getManager();
        System.out.println("Manager: " + manager.getName());
        List<Person> welders = company.getPersons("welder");
        System.out.print("Welders:");
        for (Person welder : welders) {
            System.out.print(welder.getName());
        }
        List<Person> olderThan30 = company.getPersonsOlder(34);
        System.out.println("\nPersons older than 30: ");
        for (Person person : olderThan30) {
            System.out.print(person.getName() + " " + person.getAge() + "; ");
        }
        Person newPerson = new Person("Popa Raluca", 32, "carpenter");
        company.employ(newPerson);
        System.out.println("\nNew joiner's name: " + newPerson.getName());
    }
}



