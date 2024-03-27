package org.example.homework4;

public class Task1 {
    public static void main(String[] args) {
        int year = 1889;
        boolean leapYear = isLeapYear(year);
        System.out.println("Year " + year + " is" + (leapYear ? "" : " not") + " leap");
    }

    private static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
