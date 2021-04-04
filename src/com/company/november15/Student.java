package com.company.november15;

public class Student {
    private String name;
    private University university;
    private int course;
    private int age;
    private int group;

    public Student(String name, University university, int age, int group, int course) {
        this(name, university, age);
        this.age = age;
        this.group = group;
        this.course = course;
    }

    public Student(String name, University university, int age) {
        this(name, university);
        this.age = age;
    }

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 45) {
            this.age = age;
        } else {
            System.out.println("Age must be between 16 and 45");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    // accessors
    // getter - returns a field value
    // setter - sets a field value

    public Student() {
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", course=" + course +
                '}';
    }
}