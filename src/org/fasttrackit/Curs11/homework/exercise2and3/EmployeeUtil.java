package org.fasttrackit.Curs11.homework.exercise2and3;

import java.util.*;

public class EmployeeUtil {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Ion", 20, "red", "Emerson", 2500));
        employee.add(new Employee("Ionela", 35, "brown", "Emerson", 4380));
        employee.add(new Employee("Marcela", 45, "blonde", "Vertiv", 6900));
        employee.add(new Employee("Valeriu", 52, "grey", "OSF", 9550));

        List<Employee> salaryHigher = new ArrayList<>();
        double minSalary = 3700;
        for (Employee company : employee) {
            if (company.getSalary() > minSalary) {
                salaryHigher.add(company);
                System.out.println("Persons with salary higher than: " + minSalary + salaryHigher);
            }
        }


        Map<String, List<String>> createCompanyToName = new HashMap<>();
        for (Employee company : employee) {
            createCompanyToName.put(company.getName(), Collections.singletonList(company.getCompany()));
            if (company.getCompany().equals("Emerson")) {
                System.out.println("Emerson people: " + createCompanyToName.keySet());
            }
        }


        List<Employee> sumOfSalaries = new ArrayList<>();
        double result = 0;
        for (Employee company : employee) {
            result += company.getSalary();
            System.out.println("Sum of salaries: " + result);
        }

        //System.out.println(sumOfSalaries);
    }


}

