package org.fasttrackit.curs10.files;

public class PersonObj {
    private final String name;
    private final int age;
    private final String pozitie;
    public PersonObj(String name, int age, String pozitie) {
        this.name = name;
        this.age = age;
        this.pozitie = pozitie;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return pozitie;
    }


}
