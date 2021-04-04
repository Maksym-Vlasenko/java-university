package com.company.november15;

import java.util.Arrays;

public class University {
    private String name;
    private String city;
    private String[] courses;

    public University(String name, String city, String[] courses) {
        this.name = name;
        this.city = city;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
