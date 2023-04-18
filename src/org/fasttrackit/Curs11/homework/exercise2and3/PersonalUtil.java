package org.fasttrackit.Curs11.homework.exercise2and3;

import java.util.*;

public class PersonalUtil {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ion", 85, "red"));
        people.add(new Person("Maria", 35, "blonde"));
        people.add(new Person("Eliza", 21, "pink"));
        people.add(new Person("Anda", 40, "brown"));

        List<String> name = new ArrayList<>();
        for (Person person : people) {

            name.add(person.getName());

        }
        System.out.println(name);
        Map<String, Integer> createNameToAge = new HashMap<>();
        for (Person person : people) {
            createNameToAge.put(person.getName(), person.getAge());

        }
        System.out.println("List of person names: " + createNameToAge);

        int age = 25;
        List<Person> olderThan = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > age) {
                olderThan.add(person);
            }
        }
        System.out.println("Persons older than: " + age + olderThan);

        Map<String, List<String>> createColourToName = new HashMap<>();
        for (Person person : people) {
            createColourToName.put(person.getName(), Collections.singletonList(person.getHairColour()));
        }
        System.out.println("Person's hair colour and name" + createColourToName);

        Map<Integer, String> createAgeToName = new HashMap<>();
        for(Person person :people){
            createAgeToName.put(person.getAge(), Collections.singletonList(person.getName()).toString());
        }
        System.out.println("Person's age and name: " +createAgeToName);
    }

}



