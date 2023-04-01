package org.fasttrackit.curs9;


import org.fasttrackit.curs8.homework.exercise3.Employeee;
import org.fasttrackit.curs8.homework.exercise3.Peerson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Peerson> people = new ArrayList<>();
        List<Peerson> linkedPeople = new LinkedList<>();

        listMethods(linkedPeople);

    }

    private static void listMethods(List<Peerson> people) {
        people.add(new Employeee("Elon", "Musk"));
        people.add(new Employeee("Steve", "Jobs"));
        people.add(new Employeee("Steve", "Jobs"));
        people.add(new Employeee("Steve", "Jobs"));
        people.add(new Employeee("Steve", "Jobs"));

        for (Peerson employee : people) {
            System.out.println(employee.getFirstName());
        }

        System.out.println(people.get(1));
        System.out.println(people.get(1));

        people.add(1, new Employeee("Bill", "Gates"));
        System.out.println(people.get(1));
        System.out.println(people.get(2));

        people.remove(0);
        System.out.println(people.get(0));

        System.out.println(people.size());
    }
}

