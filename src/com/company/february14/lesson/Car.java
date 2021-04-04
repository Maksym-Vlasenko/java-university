package com.company.february14.lesson;

import java.awt.*;

public class Car {
    private String vendor;
    private String model;
    private String number;
    private Color color;

    public Car(String vendor, String model, String number, Color color) {
        this(vendor, model);
        this.number = number;
        this.color = color;
    }

    public Car(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null) {
            System.out.println("Cannot assign 'null' to the field 'number'");
            return;
        }

        if (number.length() != 10) {
            System.out.println("Can't assign a value with length not equal 10 to the field 'number'");
            return;
        }
        this.number = number;
    }

    public String getFullName() {
        return vendor + " " + model;
    }

    public void printFullName() {
        System.out.println(vendor + " " + model);
    }
}
