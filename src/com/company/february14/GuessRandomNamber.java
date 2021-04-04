package com.company.february14;

import java.util.Scanner;

public class GuessRandomNamber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Загадано рандомное число, попытайтесь угадать его:");
        Scanner s = new Scanner(System.in);
        int attempt = 1;
        while (attempt <= 10) {
            System.out.printf("%d-я попытка: ", attempt);
            int userNumber = s.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Вы угадали число!!!!!!");
                break;
            }
            String message = (randomNumber < userNumber) ? "много" : "мало";
            System.out.println(message);
            attempt++;
        }
        if (attempt == 11) System.out.println("Вы не угадали число. Это число = " + randomNumber);
    }
}
