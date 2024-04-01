package org.example.homework5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[] generatedNumbers = new boolean[101];
        int randomNumber = 0;
        int sum = 0;
        int amount = 0;
        while (!generatedNumbers[randomNumber]) {
            generatedNumbers[randomNumber] = true;
            randomNumber = random.nextInt(100) + 1;
            sum += randomNumber;
            amount++;
            System.out.println("randomNumber = " + randomNumber);
        }
        System.out.println("sum = " + sum + ", amount = " + amount);
    }
}
