package org.fasttrackit.course13.homework.interfaces2;

public class Main {
    public static void main(String[] args) {
        Person[] abductedByAliens = new Person[10];
        Citizen[] citizensOfHonor = new Citizen[10];
        Employee[] employeesOfTheMonth = new Employee[10];

        Rebel rebel = new Rebel(10, "Mike");
        abductedByAliens[0] = rebel;

        RomanianWorker olivia = new RomanianWorker();
        abductedByAliens[1] = olivia;
        citizensOfHonor[1] = olivia;
        employeesOfTheMonth[1] = olivia;

        abductedByAliens[0].getAge();
        abductedByAliens[1].getAge();

        citizensOfHonor[1].getHomeCountry();


    }
}
