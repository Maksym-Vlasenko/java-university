package com.company.march28;

import com.company.february27.Person;
import com.company.march28.practice.ArrayTasks;
import com.company.march28.practice.StringTasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class March28 {
    public static void main(String[] args) {
        StringTasks stringTasks = new StringTasks();
        ArrayTasks arrayTasks = new ArrayTasks();
        System.out.println(stringTasks.middleThree("Candy"));
        System.out.println(stringTasks.extraEnd("world",10));
        System.out.println(stringTasks.withoutX("xxxkjjx"));
        System.out.println(stringTasks.countCode("codecfgfghodecodecodecjde"));
        System.out.println(stringTasks.catDog("cat8dog8"));
        System.out.println(Arrays.toString(new int[]{1, 3, 0, 5, 2, 0, 9}));
        System.out.println(Arrays.toString(arrayTasks.replaceArrayElenet(new int[]{1, 3, 0, 5, 2, 0, 9})));
        System.out.println(stringTasks.buildExpression(3,56, '_'));
        System.out.println(Arrays.toString(arrayTasks.breakIntoWords("hello, world")));
    }


    private static void testExceptions() {
        Person alex = new Person("Alex", 20);
        Person oleg = new Person("Oleg", 15);
        try {
            checkAccess(alex);
            checkAccess(oleg);
        } catch (AccessDeniedException e) {
            System.out.println("Access denied for person: " + e.getSubject());
            System.out.println("Error type: " + e.getClass().getName());
            System.out.println("Error message: " + e.getMessage());
        }
    }

    private static void checkAccess(Person person) {
        if (person.getAge() <= 18) {
            throw new AccessDeniedException("You must be older than 18 years", person);
        }
        System.out.println("Access granted for person " + person.toString());
    }

    private static void readFile() {
        try (InputStream inputStream = new FileInputStream("test1.txt")) {
            byte[] bytes = inputStream.readAllBytes();
            String fileContent = new String(bytes);
            System.out.println("Read from file: " + fileContent);
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception description: " + e.getMessage());
        }
    }
}
