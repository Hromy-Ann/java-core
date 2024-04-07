package org.example.homework6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double a;
        double b;
        char op;
        Scanner ab = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            a = Double.parseDouble(ab.nextLine());
            System.out.print("Enter an operation (+, -, *, /): ");
            op = ab.nextLine().trim().toCharArray()[0];
            System.out.print("Enter another number: ");
            b = Double.parseDouble(ab.nextLine());
            doCalculation(a, op, b);

            String yesOrNo = "";
            boolean badInput = true;
            while (badInput) {
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                yesOrNo = ab.nextLine();
                badInput = !("yes".equalsIgnoreCase(yesOrNo)
                        || "no".equalsIgnoreCase(yesOrNo));
            }

            if (yesOrNo.equalsIgnoreCase("no")) {
                return;
            }
        }
    }

    private static void doCalculation(double a, char op, double b) {
        switch (op) {
            case '+' -> System.out.println("Result: " + (a + b));
            case '-' -> System.out.println("Result: " + (a - b));
            case '*' -> System.out.println("Result: " + a * b);
            case '/' -> {
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + a / b);
                }
            }
            default -> System.out.println("Unsupported operation " + op);
        }
    }
}
