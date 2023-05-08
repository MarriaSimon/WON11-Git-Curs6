package org.fasttrackit.course13.homework.fasttrackit.curs10.homework;

import java.io.BufferedWriter;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepMain {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-report.data", true));

        List<StudentGrade> studentGrades = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("files/grades.txt"));
        String line = new String();
        while (line == br.readLine()) {
            String[] parts = line.split("\\|");
            String name = parts[0];
            String discipline = parts[1];
            int grade = Integer.parseInt(parts[2]);
            StudentGrade sg = new StudentGrade(name, discipline, grade);
            studentGrades.add(sg);
            // br.close();


            ReportGenerator reportGenerator = new ReportGenerator(studentGrades);
            reportGenerator.generateReport();
        }
    }
}