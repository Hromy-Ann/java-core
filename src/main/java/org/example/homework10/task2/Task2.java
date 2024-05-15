package org.example.homework10.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    private static final DateTimeFormatter PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    private static void printOrderedList(List<Employee> list, String sortBy) {
        class CustomEmployee {
            private String fullName;
            private Integer yearsWorked;
            private Employee employee;

            CustomEmployee(Employee employee) {
                this.employee = employee;
                fullName = employee.firstName() + ' ' + employee.lastName();
                yearsWorked = LocalDate.now().getYear() - LocalDate.parse(employee.hireDate(), PATTERN).getYear();
            }

            @Override
            public String toString() {
                return "CustomEmployee {" +
                        "fullName = '" + fullName + '\'' +
                        ", yearsWorked = " + yearsWorked +
                        '}';
            }
        }

        List<CustomEmployee> customEmployees = new ArrayList<>(list.size());
        for (Employee employee : list) {
            customEmployees.add(new CustomEmployee(employee));
        }

        Comparator<CustomEmployee> customEmployeeComparator = new Comparator<>() {
            @Override
            public int compare(CustomEmployee o1, CustomEmployee o2) {
                if ("name".equals(sortBy)) {
                    return o1.fullName.compareTo(o2.fullName);
                } else if ("year".equals(sortBy)) {
                    return o1.yearsWorked.compareTo(o2.yearsWorked);
                }
                throw new UnsupportedOperationException("Unknown sorting criteria");
            }
        };
        customEmployees.sort(customEmployeeComparator);
        System.out.println("Employees sorted by " + sortBy);
        customEmployees.forEach(System.out::println);
    }
}
