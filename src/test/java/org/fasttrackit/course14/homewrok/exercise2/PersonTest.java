package org.fasttrackit.course14.homewrok.exercise2;

import org.fasttrackit.course14.homework.exercise2.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test

    public void instantiateClass() {
        Person person = new Person();
    }


    @Test
    public void checkIfAgeIsZero() {

        ///Person person = new Person();
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("Johny", 0));

    }

    @Test
    public void checkIfAgeIsHigherThanOneHundredTwenty() {

        ///Person person = new Person();
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("Johny", 125));

    }

    @Test
    public void createAPersonWithWhiteSpace() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(" ", 45));
    }

    @Test
    public void createAPersonWithEmptyName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("", 45));
    }

    @Test
    public void createAPersonWithNullName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(null, 45));
    }

    @Test
    public void createAValidPerson() {
        Person person = new Person("John", 20);
    }

}

