package org.fasttrackit.curs10.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade studGrade : studentGrades) {
            if (studGrade.getDiscipline().equals(discipline)) {
                grades.add(studGrade.getGrade());
            }
        }
        return grades;

    }

    public List<Integer> getGradesForStudent(String name) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade studGrade : studentGrades) {
            if ((name).matches(studGrade.getName())) {
                grades.add(studGrade.getGrade());
            }
            /*
            de ce la print imi merge mereu doar pe else?
            else {
                System.out.println("Not a valid name. Please check.");
                return null;
            }
             */
        }
        return grades;
    }

    public List<StudentGrade> getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        for (StudentGrade studGrade : studentGrades) {
            if (studGrade.getDiscipline().equals(discipline)) {
                if (maxGrade == null || studGrade.getGrade() > maxGrade.getGrade()) {
                    maxGrade = studGrade;
                }

            }
        }
        return Collections.singletonList(maxGrade);
    }

    public List<StudentGrade> getMaxGrade2(){
        StudentGrade maxGrade = null;
        for (StudentGrade studGrade : studentGrades) {
            if (maxGrade == null || studGrade.getGrade() > maxGrade.getGrade()) {
                maxGrade = studGrade;
            }
        }
        return Collections.singletonList(maxGrade);
    }


    public Integer getAverageGrade(String discipline) {
        List<Integer> grades = getGradesForDiscipline(discipline);
        int aveGr = 0;
        for(int grade:grades){
            aveGr += grade;
        }
        return aveGr / grades.size();
    }
    public List<StudentGrade> getWorstGrade(String discipline){
        StudentGrade worstGrade = null;
        for(StudentGrade studGrade : studentGrades){
            if (studGrade.getDiscipline().equals(discipline)){
                if(worstGrade == null || (studGrade.getGrade() < worstGrade.getGrade())){
                    worstGrade = studGrade;
                }
            }
        }
        return Collections.singletonList(worstGrade);
    }

}
