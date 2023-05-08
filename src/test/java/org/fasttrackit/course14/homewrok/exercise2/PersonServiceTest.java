package org.fasttrackit.course14.homewrok.exercise2;

import com.google.common.util.concurrent.UncheckedTimeoutException;
import org.fasttrackit.course14.homework.exercise2.Person;
import org.fasttrackit.course14.homework.exercise2.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class PersonServiceTest {
    private PersonService personService;


    @BeforeEach
    public void setUp() {
        //personList = new ArrayList<>()
        //personService = new ArrayList<>()
        personService = new PersonService((List<Person>) personService);
    }

    @Test
    public void testAddPerson() {
        // PersonService personService = new PersonService(Person());
        Person person = new Person("Andreea", 25);
        Person addedPerson = personService.addPerson(person);
        Assertions.assertNotNull(addedPerson.getId());
        Assertions.assertEquals(Person.getName(), addedPerson.getName());
        Assertions.assertEquals(person.getAge(), addedPerson.getAge());
    }


    @Test
    public void testRemovePerson() {
        Person person = new Person("Andreea", 25);
        Person addedPerson = personService.addPerson(person);
        Person removedPerson = personService.removePerson(addedPerson.getId());
        Assertions.assertEquals(addedPerson.getId(), removedPerson.getId());
    }

    @Test
    public void testRemovePersonNonExisting() {
        PersonService personService = new PersonService();
        Person person = new Person("Johnny", 15);
        personService.addPerson(person);
        Assertions.assertThrows(UncheckedTimeoutException.class, () -> {
            personService.removePerson(48);
        });

    }

    @Test
    public void testGetPersonsOlderThan() {
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Maria", 30));
        personService.addPerson(new Person("Alina", 40));
        personService.addPerson(new Person("Irina", 50));
        List<Person> olderPersons = personService.getPersonsOlderThan(35);
        Assertions.assertEquals(2, olderPersons.size());
        Assertions.assertEquals("Alina", olderPersons.get(0).getName());
        Assertions.assertEquals("Irina", olderPersons.get(1).getName());
    }

    @Test
    public void testGetPerson() {
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Andreea", 21));
        personService.addPerson(new Person("Ionel", 33));

        Person person = personService.getPerson("Ionel");
        Assertions.assertEquals("Ionel", person.getName());
        Assertions.assertEquals(33, person.getAge());
    }
}









