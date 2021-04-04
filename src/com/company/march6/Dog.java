package com.company.march6;

import java.awt.*;

public abstract class Dog extends Pet {
    private DogBread bread;

    public Dog(String name, int age, Color[] colors, DogBread bread) {
        super(name, age, colors);
        this.bread = bread;
    }
    public enum DogBread {
        SHEPHERD,
        BULLDOG,
        HUSKY,
        DOBERMAN
    }
    public DogBread getBread() {
        return bread;
    }

    public void setBread(DogBread bread) {
        this.bread = bread;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "bread=" + bread +
                '}';
    }
}