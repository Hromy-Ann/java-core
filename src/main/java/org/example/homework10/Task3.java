package org.example.homework10;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String sentence = """
                She Wolf (Spanish: Loba) is the eighth studio album and third 
                English-language album by Colombian singer-songwriter Shakira""";
        splitAndPrint(sentence);
    }

    public static void splitAndPrint(String sentence) {
        Arrays.asList(sentence.split(" "))
                .forEach(word -> System.out.println(word));
    }
}
