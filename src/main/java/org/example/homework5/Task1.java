package org.example.homework5;

public class Task1 {
    public static void main(String[] args) {
        int input = 280;
        int evenDigitSum = getEvenDigitSum(input);
        System.out.println("For input number " + input + " sum of even digits is " + evenDigitSum);
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 0;
        do {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                result += lastDigit;
            }
            number = number / 10;
        } while (number > 0);
        return result;
    }
}
