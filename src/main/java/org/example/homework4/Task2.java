package org.example.homework4;

public class Task2 {
    public static void main(String[] args) {
        long min = -6;
        printYearsAndDays(min);
    }

    private static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years = days / 365;
            long daysNotInYear = days - years * 365;

            System.out.println(minutes + " min = " + years + " y and " + daysNotInYear + " d");
        }
    }
}
