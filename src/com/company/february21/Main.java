package com.company.february21;

public class Main {
    public static void main(String[] args) {
        /*MathOperations operations = new MathOperations();
        System.out.println("4 + 5 = " + operations.sum(4, 5));

        System.out.println("4.2 + 5.9 = " + operations.sum(4.2, 5.9));

        System.out.println("4 + 5 + 9 = " + operations.sum(4, 5, 9));

        System.out.println(operations.sum(4, 5, 5, 5, 7, 9));
        System.out.println(operations.sum());*/
        Animal husky = new Dog("Nick", 7, DogBreed.HUSKY);
        System.out.println(husky.toString());
        husky.printInfo();

        Cat sphinx = new Cat("Alex", 4, CatBreed.SPHINX);
        System.out.println(sphinx.toString());
    }
}
