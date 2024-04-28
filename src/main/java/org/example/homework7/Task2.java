package org.example.homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String email = "hromovaannaa@gmail.com";
        boolean result = validateEmail(email);
        System.out.println(email + " is" + (result ? "" : " not") + " a valid email");
    }

    private static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^((?!\\.)[\\w-.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?\\w)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
