package org.fasttrackit.course16.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PersonService {

    private static List<Person> persons;

    public PersonService() {
        persons = new ArrayList();
    }

    public static List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    //- list all the persons names: firstName lastName
    public List<String> getAllPersonsNames() {
        return persons.stream()
                .map(person -> person.firstName() + " "
                        + person.lastName())
                .collect(Collectors.toList());
    }

    //- list all persons that are major
    public List<Person> getMajorPersons() {
        return persons.stream()
                .filter(person -> person.age() > 18)
                .toList();
    }

    //- list all persons from Oradea
    public List<Person> getPersonsFromOradea() {
        return persons.stream()
                .filter(person -> person.city().contains("Oradea"))
                .toList();
    }

    // list all persons from Oradea OR Cluj
    public List<Person> getPersonsFromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> person.city().equalsIgnoreCase("Oradea")
                        || person.city().equalsIgnoreCase("Cluj"))
                .toList();
    }

    // list all firstNames CAPITALIZED
    public List<String> firstNamesCapitalized() {
        return persons.stream()
                .map(person -> person.firstName().toUpperCase())
                .toList();
    }

    // list all person names: firstName firstletter from last name: Stefan B.
    public List<String> firstNameAndFirstLetter() {
        return persons.stream()
                .map(person -> person.firstName() + " "
                        + person.lastName().charAt(0) + ".")
                .toList();
    }

    // list all persons with 18 < age < 60
    public List<Person> getPersonsWithAge() {
        return persons.stream()
                .filter(person -> person.age() > 18
                        && person.age() < 60)
                .toList();
    }

    //- list all persons having first name starting with A
    public List<Person> firstNameA() {
        return persons.stream()
                .filter(person -> person.firstName()
                        .startsWith("A"))
                .toList();
    }

    //- list all first names UNIQUELY
    public List<String> getUniqueNames() {
        return persons.stream()
                .map(Person::firstName)
                .distinct()
                .toList();
    }

    // sort the persons by first name
    public List<Person> sortPersonsByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList();
    }

    //sort the persons by last name
    public List<Person> sortPersonsByLastName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
    }

    // sort the persons by first name, last name and then age
    public List<Person> sortPersons() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName)
                        .thenComparing(Person::lastName)
                        .thenComparingInt(Person::age))
                .collect(Collectors.toList());
    }
}
