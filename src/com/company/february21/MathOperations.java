package com.company.february21;

public class MathOperations {

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void test(boolean b) {
        if (b) {
            return;
        }
        System.out.println("test");
    }
}
