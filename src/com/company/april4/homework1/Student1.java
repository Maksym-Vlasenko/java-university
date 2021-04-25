package com.company.april4.homework1;

import com.company.november15.University;

import java.util.ArrayList;

public class Student1 {
    private String fullName;
    private ArrayList<University> university;
    private int age;
    private int group;

    public Student1(String fullName, ArrayList<University> university, int age, int group) {
        this.fullName = fullName;
        this.university = university;
        this.age = age;
        this.group = group;
    }

    public Student1(String fullName, ArrayList<University> university, int age) {
        this.fullName = fullName;
        this.university = university;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<University> getUniversity() {
        return university;
    }

    public void setUniversity(ArrayList<University> university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "fullName='" + fullName + '\'' +
                ", university=" + university +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
