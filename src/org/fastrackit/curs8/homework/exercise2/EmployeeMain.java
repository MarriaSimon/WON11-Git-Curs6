package org.fastrackit.curs8.homework.exercise2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee programmer = new Programmer("Michael", "Jordan", "8,Soporului Street, Bucharest");
        programmer.getFirstName();
        programmer.getLastName();
        programmer.getAddress();
        programmer.getBirthday();
        programmer.dateOfEmployment();
        ((Programmer) programmer).getPosition();
        ((Programmer) programmer).language("Java expert");

        Employee databaseAdmin = new DatabaseAdmin("Alin", "Matesan", "17,Calea Turzii Street, Bucharest");
        databaseAdmin.getFirstName();
        databaseAdmin.getLastName();
        databaseAdmin.getAddress();
        databaseAdmin.getBirthday();
        databaseAdmin.dateOfEmployment();
        ((DatabaseAdmin) databaseAdmin).getPosition();
        ((DatabaseAdmin) databaseAdmin).dbTechnology("Database expert");

        Person person3 = new PersonEx3("Alin", "Matesan");
        ((PersonEx3) person3).getFullName();
        ((PersonEx3) person3).age();
    }
}
