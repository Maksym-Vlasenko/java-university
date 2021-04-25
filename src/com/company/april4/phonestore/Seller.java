package com.company.april4.phonestore;

public class Seller {
    private String name;
    private String surname;
    private int age;
    private int workExpreence;

    public Seller(String name, String surname, int age, int workExpreence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workExpreence = workExpreence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExpreence() {
        return workExpreence;
    }

    public void setWorkExpreence(int workExpreence) {
        this.workExpreence = workExpreence;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workExpreence=" + workExpreence +
                '}';
    }
}
