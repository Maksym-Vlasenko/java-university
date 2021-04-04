package com.company.november29;

public class Operation {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double power(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double min(double a, double b) {
        if (a <= b) {
            return a;
        }
        return b;
    }

    public static double max(double a, double b) {
        return (a >= b) ? a : b;
    }
}
