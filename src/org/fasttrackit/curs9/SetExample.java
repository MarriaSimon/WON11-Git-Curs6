package org.fasttrackit.curs9;

import org.fasttrackit.curs8.homework.exercise3.Employeee;
import org.fasttrackit.curs8.homework.exercise3.Peerson;
import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<Employeee> employees = new HashSet<>();
        Set<Employeee> employees1 = new TreeSet<>();

        setMethods(employees1);
    }

    private static void setMethods(Set<Employeee> employees) {
        Employeee e1 = new Employeee("A", "B");
        Employeee e2 = new Employeee("B", "C");
        employees.add(e1);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        Employeee e3 = new Employeee("A", "B");
        employees.add(e3);

        Iterator<Employeee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employeee e = iterator.next();
            System.out.println(e);
        }
    }
}


