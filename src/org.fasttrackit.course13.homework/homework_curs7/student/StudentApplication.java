package org.fasttrackit.course13.homework.homework_curs7.student;

public class StudentApplication implements Student {
    private final String name;
    private final double grade;
    private static double totalGrades = 0;
    public static int numberOfStudents = 0;

    public StudentApplication(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        numberOfStudents++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getGrade() {
        return grade;
    }

    public static double getAverageGrades() {
        return (double) totalGrades / numberOfStudents;
    }
}