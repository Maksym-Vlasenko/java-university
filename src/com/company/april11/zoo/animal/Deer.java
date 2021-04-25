package com.company.april11.zoo.animal;

import com.company.april11.zoo.animal.breed.AnimalBreed;
import com.company.april11.zoo.animal.breed.DeerBreed;

public class Deer extends Animal {
    private DeerBreed deerBreed;
    private String color;

    public Deer(String name, int age, String gender, DeerBreed deerBreed, String color) {
        super(name, age, gender);
        this.deerBreed = deerBreed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Deer running");
    }

    @Override
    public void talk() {
        System.out.println("The deer say: CHHHHH");
    }

    @Override
    public AnimalBreed getBreed() {
        return this.deerBreed;
    }

    public void setDeerBreed(DeerBreed deerBreed) {
        this.deerBreed = deerBreed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Deer{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", deerBreed=" + deerBreed +
                ", color='" + color + '\'' +
                "} ";
    }
}
