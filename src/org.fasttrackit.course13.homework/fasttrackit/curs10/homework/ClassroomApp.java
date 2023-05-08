package org.fasttrackit.course13.homework.fasttrackit.curs10.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomApp {
    public static void main(String[] args) throws FileNotFoundException {
        List<StudentGrade> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files/grades.txt"));
        while (scanner.hasNext())  {
            String line = scanner.nextLine();
            String[] tokens = line.split("\\|");
            String name = tokens[0];
            String discipline = tokens[1];
            int grade = Integer.parseInt(tokens[2]);
            StudentGrade studGrade = new StudentGrade(name, discipline, grade);
            students.add(studGrade);
            //System.out.println(discipline);
        }
        Classroom classroom = new Classroom(students);
        //System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForDiscipline("Physics"));
        System.out.println(classroom.getGradesForStudent("Eilert Mechteld"));
        System.out.println(classroom.getMaxGrade("Physics"));
        System.out.println(classroom.getMaxGrade2());
        System.out.println(classroom.getAverageGrade("Computer Science"));
        System.out.println(classroom.getWorstGrade("Physics"));

    }
}
