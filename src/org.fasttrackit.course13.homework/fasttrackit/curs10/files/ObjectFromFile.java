package org.fasttrackit.course13.homework.fasttrackit.curs10.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ObjectFromFile {
    public static void main(String[] args) throws IOException {
        List<PersonObj> people = readPersons("files/person.data");

       /* for (PersonObj person : people) {
            if (person.getAge() > 20) {
                System.out.println(person.getName() + " " + person.getPosition());

        */
            }
        public static void writeReport(List<PersonObj> persons) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.data"));
            for (PersonObj person : persons){
                writer.write(person.getName() + " has age" + person.getAge() + "with position" + person.getPosition());
                writer.newLine();
            }
            writer.flush();
            writer.close();
        }



    private static List<PersonObj> readPersons(String filePath) throws FileNotFoundException {
        List<PersonObj> persons = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            // String[] tokens = line.split("\\|");
            // String[] token = line.split(Pattern.quote("|"));
            persons.add(getPersonFromLine(persons, line));
        }
        return persons;
    }

    private static PersonObj getPersonFromLine(List<PersonObj> persons, String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        return new PersonObj(tokens[0],
                tokens.length >= 2 ? Integer.parseInt(tokens[1].replaceAll("[^(0-9)]", "")) : 18,
                tokens.length >= 3 ? tokens[2] : "no job");
    }
}
