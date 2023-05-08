package org.fasttrackit.course14.homework.exercise2;


import com.google.common.util.concurrent.UncheckedTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private List<Person> personList;
    private int idPers = 0;


    public PersonService(List<Person> personList) {
        personList = new ArrayList<>();
        this.personList = personList;
    }

    public PersonService() {
        personList = new ArrayList<>();
    }


    //Person addPerson(Person person) : persoana primita NU are ID, is e va genera dupa adaugare. Persoana returnata are id-ul setat
    public Person addPerson(Person person) {
        if (person.getName() == null || person.getAge() <= 0 || person.getAge() > 120) {
            throw new IllegalArgumentException("Invalid name or age for the person. Try again");
        }
        int id = idPers++;
        person.setId(id);
        personList.add(person);
        return person;
    }

    //Person removePerson(int id) : sterge persoana cu id-ul respectiv si o returneaza. Arunca exceptie (unchecked) daca nu exista
    public Person removePerson(int id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
                return person;
            }
        }
        throw new UncheckedTimeoutException("Id Not Found. Check Again");
    }


    //List<Person> getAllPersons()
    public List<Person> getAllPersons() {
        return personList;
    }

    // List<Person> getPersonsOlderThan(int age): validati age-ul (pozitiv, <120)
    public List<Person> getPersonsOlderThan(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Age must be positive and less than 120");
        }
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    // List<String> getAllPersonNames() - returneaza doar numele
    public List<String> getAllPersonNames() {
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
        }
        return names;
    }

    // + Person getPerson(String name)
    public Person getPerson (String names) {
        if (names == null || names.isEmpty() || names.contains("\s")) {
            throw new IllegalArgumentException("Not a valid name. Please enter the full name");
        }
        for (Person person : personList) {
            if (person.getName().equals(names)) {
                return person;
            }
        }
        throw new IllegalArgumentException("Person not found with name: " + names);
    }


    //  Person getPersonById(int Id)
    public Person getPersonById(int Id) {
        for (Person person : personList) {
            if (person.getId() == Id) {
                return person;
            }
        }
        throw new IllegalArgumentException("Person not found with id: " + Id);
    }

}
