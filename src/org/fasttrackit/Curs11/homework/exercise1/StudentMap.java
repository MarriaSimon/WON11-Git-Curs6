package org.fasttrackit.Curs11.homework.exercise1;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Simon Anisia", 8);
        studentMap.put("Florian Chiril", 9);
        studentMap.put("Axeniuc Ioan", 5);
        studentMap.put("Pop Anuta", 6);

        System.out.println(studentMap);


        String name = null;
        int grade = Integer.MIN_VALUE;
        for (String studName : studentMap.keySet()) {
            int maxGrade = studentMap.get(studName);
            if (maxGrade > grade) {
                grade = maxGrade;
                name = studName;
            }
        }
        System.out.println("Student with highest grade: " + name + " " + grade);
    }
}
