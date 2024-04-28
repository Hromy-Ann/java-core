package org.example.homework7;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        RomanNumber num1 = RomanNumber.L;
        RomanNumber num2 = RomanNumber.V;

        String operation = "+";
        int result = calculator.calculate(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }

    private int calculate(RomanNumber first, RomanNumber second, String operation) {
        char op = operation.toCharArray()[0];
        switch (op) {
            case '+' -> {
                return first.decimalValue + second.decimalValue;
            }
            case '-' -> {
                return first.decimalValue - second.decimalValue;
            }
            case '*' -> {
                return first.decimalValue * second.decimalValue;
            }
            case '/' -> {
                return first.decimalValue / second.decimalValue;
            }
            default -> throw new UnsupportedOperationException("Unsupported operation " + op);
        }
    }

    enum RomanNumber {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1);

        private final int decimalValue;

        RomanNumber(int decimalValue) {
            this.decimalValue = decimalValue;
        }
    }
}
