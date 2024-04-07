package org.example.homework6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 33, 55, 77, 88, 3};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        int size = array.length;
        int i = -1;
        while (++i < size / 2) {
            array[i] += array[size - i - 1];
            array[size - i - 1] = array[i] - array[size - i - 1];
            array[i] -= array[size - i - 1];
        }
    }
}
