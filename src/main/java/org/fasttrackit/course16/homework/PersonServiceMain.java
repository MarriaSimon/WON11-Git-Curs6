package org.fasttrackit.course16.homework;

import java.util.List;

public class PersonServiceMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        personService.addPerson(new Person("Ionel", "Pop", 38, "Cluj"));
        personService.addPerson(new Person("Andreea", "Matesan", 25, "Oradea"));
        personService.addPerson(new Person("Marin", "Simion", 32, "Oradea"));
        personService.addPerson(new Person("Cristina", "Sabou", 37, "Zalau"));
        personService.addPerson(new Person("Ioana", "Dunca", 29, "Cluj"));
        personService.addPerson(new Person("Ioana", "Popescu", 17, "Bucuresti"));
        personService.addPerson(new Person("Maria", "Popescu", 63, "Baia Mare"));
        personService.addPerson(new Person("Andreas", "Tamas", 16, "Cluj"));

        //- list all the persons names: firstName lastName
        List<String> personNames = personService.getAllPersonsNames();
        for (String fullName : personNames) {
            System.out.println("Person's full name: " + fullName);
        }

        //- list all persons that are major
        for (Person person : personService.getMajorPersons()) {
            System.out.println("Major persons: " + person.lastName() + " " + person.firstName());
        }

        //- list all persons from Oradea
        for (Person person : personService.getPersonsFromOradea()) {
            System.out.println("People from Oradea: " + person.lastName() + " " + person.firstName());
        }

        // list all persons from Oradea OR Cluj
        for (Person person : personService.getPersonsFromOradeaOrCluj()) {
            System.out.println("People from Oradea, or Cluj: " + person.lastName() + " " + person.firstName() + " " + person.city());
        }

        // list all firstNames CAPITALIZED
        for (String firstName : personService.firstNamesCapitalized()) {
            System.out.println(firstName);
        }

        // list all person names: firstName firstletter from last name: Stefan B.
        for (String firstNameAndLetter : personService.firstNameAndFirstLetter()) {
            System.out.println(firstNameAndLetter);
        }

        // list all persons with 18 < age < 60
        for (Person person : personService.getPersonsWithAge()) {
            System.out.println("Persons between 18 and 60: " + person.lastName() + " " + person.firstName() + " " + person.age());
        }

        //- list all persons having first name starting with A
        for (Person person : personService.firstNameA()) {
            System.out.println("Person with first name starting with A: " + person.firstName());
        }

        //- list all first names UNIQUELY
        for (String firstName : personService.getUniqueNames()) {
            System.out.println("Unique names: " + firstName);
        }

        // sort the persons by first name
        for (Person person : personService.sortPersonsByFirstName()) {
            System.out.println("Sorted persons by first names: " + person.firstName() + " " + person.lastName());
        }

        // sort the persons by Last name
        for (Person person : personService.sortPersonsByLastName()) {
            System.out.println("Sorted persons by last names: " + person.lastName() + " " + person.firstName());
        }

        // sort the persons by first name, last name and then age
        List<Person> sortedPerson = personService.sortPersons();
        sortedPerson.forEach(person -> System.out.println(person.firstName() + " " + person.lastName() + "Age: " + person.age()));
    }
}
