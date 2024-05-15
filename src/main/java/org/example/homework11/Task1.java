package org.example.homework11;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String string = "hjfhfkjfjuk";
        System.out.println(countLetters(string));
    }

    private static Map<Character, Integer> countLetters(String input) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character letter : input.toCharArray()) {
            result.put(letter, result.getOrDefault(letter, 0) + 1);
        }
        return result;
    }
}
