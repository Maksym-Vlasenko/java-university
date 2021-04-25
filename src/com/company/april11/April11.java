package com.company.april11;

import com.company.february27.Person;

public class April11 {
    public static void main(String[] args) {
        Box<String> stringsBox = new Box<>();
        stringsBox.addElement("Hello");
        System.out.println();

        Box<Person> personBox = new Box<>();
        Person alex = new Person("Alex", 40);
        personBox.addElement(alex);

        String[][] strings = {
                {"a", "b"},
                {"L", "ll", "jr"}
        };

        Integer[][] numbers = {
                {1, 0, 3},
                {1, 9, 8},
                {0, 0, 0}
        };
        System.out.println(toothedArray(strings));
        System.out.println(toothedArray(numbers));

        Printer<Person> printer = new Printer<>();
        printer.print(alex);

        Printer<Transport> transportPrinter = new Printer<>();
        Transport sportCar = new SportCar();
        transportPrinter.print(sportCar);
    }

    private static <T> boolean toothedArray(T[][] array) {
        if (array.length == 0) {
            return false;
        }
        int firstRowLength = 0;
        for (T[] currentRow : array) {
            if (currentRow.length != firstRowLength) {
                return true;
            }
        }
        return false;
    }
}