package org.example.homework12;

import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Anna Ivanova", 20, 83);
        Student student2 = new Student("Alex Petov", 21, 100);
        Student student3 = new Student("Alla Rost", 30, 70);
        Student student4 = new Student("Nikola Tesla", 18, 61);
        Student student5 = new Student("Nika Vika", 40, 20);
        Student student6 = new Student("Peter Chekh", 47, 58);
        List<Student> students = List.of(student1, student2, student3, student4, student5, student6);

        System.out.println("Names of all students:");
        students.stream()
                .map(Student::name)
                .forEach(System.out::println);

        System.out.println("Names of students who are older than 20 years:");
        students.stream()
                .filter(s -> s.age() > 20)
                .map(Student::name)
                .forEach(System.out::println);

        System.out.println("Names of students who have scored an A grade:");
        students.stream()
                .filter(s -> s.grade() >= 90)
                .map(Student::name)
                .forEach(System.out::println);

        double averageGrade = students.stream()
                .mapToInt(Student::grade)
                .average()
                .orElse(0);
        System.out.println("Average grade of all students: " + averageGrade);

        students.stream()
                .max(Comparator.comparingInt(Student::grade))
                .ifPresent(s -> System.out.println("Student with the highest grade: " + s));

        long studentsFailed = students.stream()
                .filter(s -> s.grade() < 60)
                .count();
        System.out.println("Number of students with a grade below 60: " + studentsFailed);
    }
}
