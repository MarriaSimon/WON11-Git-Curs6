package org.fasttrackit.curs10.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReportGenerator {

    private List<StudentGrade> studentGrades;

    public ReportGenerator(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void generateReport() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-report.data", true));
        writer.newLine();
        writer.close();

        StudentGrade maxGrade = null ;
        for (StudentGrade studGrade : studentGrades) {
            if (maxGrade == null || studGrade.getGrade() > maxGrade.getGrade()) {
                maxGrade = studGrade;
            }
        }
        System.out.println("Highest grade: " + maxGrade.getName() + " " + (List<StudentGrade>) maxGrade);




        //nota medie
        List<StudentGrade> studentGrades = new ArrayList<>();
        int sum = 0;
        for (StudentGrade studentGrade : studentGrades) {
            sum += studentGrade.getGrade();
        }
        int average = sum / studentGrades.size();
        System.out.println("Average grade: " + average);


        // lowest grade
        StudentGrade minGrade = null;
        for (StudentGrade studentGrade : studentGrades) {
            if (minGrade == null || studentGrade.getGrade() < minGrade.getGrade()) {
                minGrade = studentGrade;
            }
        }
        System.out.println("Lowest grade: " + minGrade.getName() + " " + minGrade.getGrade());

    }

}











