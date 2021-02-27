package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);
    final static byte MONTHS_IN_YEAR = 12;

    public static double readNumber(String prompt){
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
