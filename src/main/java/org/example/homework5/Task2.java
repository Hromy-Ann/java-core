package org.example.homework5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        printArray(numbers);
        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("Sorted array consists of:");
        printArray(sortedNumbers);
    }

    private static int[] getIntegers(int size) {
        Random generator = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = generator.nextInt(100);
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
        int[] resultSort = Arrays.copyOf(array, array.length);
        //Selection sort implementation
        for (int i = 0; i < resultSort.length; i++) {
            int min = resultSort[i];
            int indexMin = i;
            for (int j = i + 1; j < resultSort.length; j++) {
                if (resultSort[j] < min) {
                    min = resultSort[j];
                    indexMin = j;
                }
            }
            int swap = resultSort[i];
            resultSort[i] = resultSort[indexMin];
            resultSort[indexMin] = swap;
        }
        return resultSort;
    }
}
