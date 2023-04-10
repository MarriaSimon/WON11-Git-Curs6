package org.fasttrackit.curs10.homework_c9;


import java.util.ArrayList;
import java.util.List;

public class Comp2 {
    private List<Person2> employees = new ArrayList<>();

    public Person2 getManager() {
        for (Person2 person : employees) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public void employ(Person2 person) {
        if (getManager() != null) {
            System.out.println("We already have a manager");
            return;
        }
        employees.add(person);
    }
}
