package org.example.homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        System.out.println("Min = " + findMin(returnedArray));
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    private static int[] readIntegers() {
        System.out.println("Enter a list of integers separated by commas: ");
        String[] splits = new Scanner(System.in).nextLine().split(",");

        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }
}
