package com.company.february27;

public class Calculator {
    public void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + sum(a, b));
    }

    public static void printSub(int a, int b) {
        System.out.println(a + " - " + b + " = " + sub(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
