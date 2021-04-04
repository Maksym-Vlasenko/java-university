package com.company.march14;

public class Student extends Human {
    private String university;

    public Student(String university, String name, int age) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void greet(Person other) {
        super.greet(other);
        System.out.println("I'm a student of the university " + this.university + "\n");
    }
}
