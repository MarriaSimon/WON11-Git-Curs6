package org.fasttrackit.course13.course13;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String country;

    private final boolean isMarried;
    private final String company;

    public Person(String name, int age, String country, boolean isMarried, String company) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.isMarried = isMarried;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", isMarried=" + isMarried +
                ", company='" + company + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isMarried == person.isMarried && Objects.equals(name, person.name) && Objects.equals(country, person.country) && Objects.equals(company, person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country, isMarried, company);
    }
}
