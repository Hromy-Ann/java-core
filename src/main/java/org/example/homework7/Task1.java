package org.example.homework7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        char[] charsToRemove = {'a', 'd', '3'};
        String modifiedString = removeCharacters(initialString, charsToRemove);
        System.out.println("Initial string: " + initialString);
        System.out.println("Characters to remove: " + Arrays.toString(charsToRemove));
        System.out.println("Modified string: " + modifiedString);
    }

    private static String removeCharacters(String input, char[] charsToRemove) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            boolean skip = false;
            for (char charToRemove : charsToRemove) {
                skip = c == charToRemove;
                if (skip) {
                    break;
                }
            }
            if (!skip) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
