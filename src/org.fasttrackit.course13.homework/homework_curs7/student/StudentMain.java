package org.fasttrackit.course13.homework.homework_curs7.student;

public class StudentMain {
    public static void main(String[] args) {
        StudentApplication student1 = new StudentApplication("Ioana", 8.7);
        StudentApplication student2 = new StudentApplication("Andreea", 7.32);
        StudentApplication student3 = new StudentApplication("Paul", 9.85);
        StudentApplication student4 = new StudentApplication("Ionel", 6.32);
        StudentApplication student5 = new StudentApplication("Ionel", 5.5);

        System.out.println("Number of students: " + StudentApplication.numberOfStudents);
        System.out.println("Average grade: " + StudentApplication.getAverageGrades());
    }
}
