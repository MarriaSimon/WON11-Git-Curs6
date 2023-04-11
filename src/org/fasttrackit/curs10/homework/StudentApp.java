package org.fasttrackit.curs10.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

    public static List<StudentGrade> readGradesFile(String filePath) throws FileNotFoundException {
        List<StudentGrade> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String tokens[] = line.split("\\|");
            students.add(new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }
        return students;
    }

    public static void main(String[] args) throws FileNotFoundException {
       // System.out.println("Student's name");
        List<StudentGrade> students = readGradesFile("files/grades.txt");
        for (StudentGrade student : students) {
            System.out.println("Student's name: " +  student.getName()  + "," + " Discipline: " + student.getDiscipline() + "," + "Grade: " + student.getGrade());
        }

    }

}

