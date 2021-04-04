package com.company.november29;

public class Dog {
    private String name;

    private Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dog create(String name) {
        return new Dog(name);
    }
}
