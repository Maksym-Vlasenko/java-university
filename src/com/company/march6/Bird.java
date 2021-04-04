package com.company.march6;

import java.awt.*;

public abstract class Bird extends Pet {
    private BirdType bird;

    public Bird(String name, int age, Color[] colors, BirdType bird) {
        super(name, age, colors);
        this.bird = bird;
    }

    public enum BirdType {
        FALCON,
        PARROT,
        SPARROW,
        HAWK

    }

    public BirdType getBirdType() {
        return bird;
    }

    public void setBirdType(BirdType bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "bird=" + bird +
                '}';
    }
}
