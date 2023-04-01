package org.fasttrackit.curs9;

import org.fasttrackit.curs8.homework.exercise3.Employeee;


import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue<Employeee> priorityQueue = new PriorityQueue<>(new Comparator<Employeee>() {
            @Override
            public int compare(Employeee o1, Employeee o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
        });

        priorityQueue.add(new Employeee("A", "B", 1));
        priorityQueue.add(new Employeee("C", "D", 1));
        priorityQueue.add(new Employeee("E", "F", 0));

        Employeee employee = priorityQueue.poll();
        System.out.println(employee);
    }
}

