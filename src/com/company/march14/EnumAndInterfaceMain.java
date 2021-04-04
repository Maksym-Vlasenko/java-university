package com.company.march14;

public class EnumAndInterfaceMain {
    public static void main(String[] args) {
        Person alex = new Student("CHNU", "Alex", 25);
        Person olga = new Student("MNU", "Olga", 45);
        alex.greet(olga);
        olga.greet(alex);

        Person ivan = new Employee("Google", "Ivan", 28);
        Person petr = new Employee("Amazon", "Petr", 39);
        ivan.greet(petr);
        petr.greet(ivan);

        Person.test();
        System.out.println(Person.NUMBER);
    }
}