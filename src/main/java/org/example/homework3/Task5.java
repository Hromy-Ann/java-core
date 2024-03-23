package org.example.homework3;

public class Task5 {
    public static void main(String[] args) {
        double celsius = 36.6;
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273;
        System.out.printf("%.1f °C = %.2f °F%n", celsius, fahrenheit);
        System.out.println(celsius + " °C = " + kelvin + "K");
    }
}
