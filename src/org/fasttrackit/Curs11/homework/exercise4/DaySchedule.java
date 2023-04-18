package org.fasttrackit.Curs11.homework.exercise4;


import java.util.Arrays;
import java.util.List;

import static org.fasttrackit.Curs11.homework.exercise4.DaysOfTheWeek.*;


public class DaySchedule {

    private List<String> listOfActivities;


    public DaySchedule(List<String> listOfActivities) {
        this.listOfActivities = listOfActivities;
    }


    public List<String> getListOfActivities() {
        return listOfActivities;
    }

    public static void main(String[] args) {
        //  DaySchedule schedule = new DaySchedule(MONDAY, Arrays.asList("sa", "as", "kk"));
        DaySchedule schedule = new DaySchedule(Arrays.asList("Hair Appointment", "Work", "Java Homework"));
        DaysOfTheWeek daysOfTheWeek = MONDAY;
        System.out.println(MONDAY);
        for (String activities : schedule.getListOfActivities()) {
            System.out.println("-" + activities);
        }
    }

}



