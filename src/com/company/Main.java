package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] numbers = {1, 5, 2, 0};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(reverseArray(numbers)));
        /*outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration #" + i);
            for (int j = 0; j < 30; j++) {
                if (j == 15) {
                    continue outer;
                }
                System.out.println("j = " + j);
            }
        }*/
        /*int[] numbers = {2, 8, 1, 2, 6};
        System.out.println("Sum = " + sum(numbers));
        System.out.println("Multiply = " + multiply(numbers));
        numbers[2] = 100;
        System.out.println("Sum new = " + sum(numbers));*/
        int[] array = {2, 5, 6, 7, 8, 9, 0, 11, 18, 20};
        for (int i = 1; i <= 4; i++) {
            System.out.print(array[i] + " ");
        }
        int[] a = new int[5];
        System.out.println(Arrays.toString(a));
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.printf("%d ", number);
        }
    }

    private static int[] reverseArrayWithoutTemp(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    private static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int arrayIndex = array.length - 1, resultIndex = 0; arrayIndex >= 0; arrayIndex--, resultIndex++) {
            result[resultIndex] = array[arrayIndex];
        }
        return result;
    }

    private static int evenSumWhile(int[] array) {
        int evenSum = 0;
        int counter = 0;
        while (counter < array.length) {
            if (counter % 2 == 0) {
                evenSum += array[counter];
            }
            counter++;
        }
        return evenSum;
    }

    private static int evenSumForeach(int[] array) {
        int evenSum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        return evenSum;
    }

    private static int evenSum(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];
            }
        }
        return evenSum;
    }

    private static int multiply(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    private static void ifThenElse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int a = scanner.nextInt();
        System.out.print("Enter second operand: ");
        int b = scanner.nextInt();
        double result = b != 0 ? (double) a / b : Double.NaN;
        System.out.printf("Result = %.2f%n", result);
    }

    private static void printSeasonName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month name: ");
        String monthName = scanner.nextLine();
        String seasonName;
        switch (monthName) {
            case "december":
            case "january":
            case "february":
                seasonName = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                seasonName = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                seasonName = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                seasonName = "Autumn";
                break;
            default:
                seasonName = "not existing month";
                break;
        }
        System.out.printf("It's a %s%n", seasonName);
    }

    private static void printMonthName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = scanner.nextInt();
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "not existing month";
        }
        System.out.printf("It's a %s%n", monthName);
    }

    private static int sumTo(int border) {
        if (border < 1) return 0;
        int sum = 0;
        for (int number = 1; number <= border; number++) {
            sum += number;
        }
        return sum;
    }

    // border = 4, sum = 0, number = 1
    // sum = 1, number = 2
    // sum = 3, number = 3
    // sum = 6, number = 4
    // sum = 10, number = 5

    private static String readLine() {
        System.out.print("Enter a phrase: ");
        return new Scanner(System.in).nextLine();
    }
}