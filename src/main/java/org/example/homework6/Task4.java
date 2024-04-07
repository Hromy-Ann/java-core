package org.example.homework6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        countVowelsAndConsonants(new Scanner(System.in).nextLine());
    }

    private static void countVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        char[] array = input.toLowerCase().toCharArray();

        for (char ch : array) {
            switch (ch) {
                case 'a', 'e', 'o', 'i', 'u', 'y' -> vowelsCount++;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
                        'r', 's', 't', 'v', 'w', 'x', 'z' -> consonantsCount++;
                default -> System.err.println("Skipped non-letter character " + ch);
            }
        }

        System.out.println("Number of vowels:" + vowelsCount);
        System.out.println("Number of consonants:" + consonantsCount);
    }
}
