package com.company.march6;

import java.awt.*;

public class Parrot extends Bird {
    private String favouriteFruit;

    public Parrot(String name, int age, Color[] colors, BirdType bird, String favouriteFruit) {
        super(name, age, colors, bird);
        this.favouriteFruit = favouriteFruit;
    }

    public String getFavouriteFruit() {
        return favouriteFruit;
    }

    public void setFavouriteFruit(String favouriteFruit) {
        this.favouriteFruit = favouriteFruit;
    }

    @Override
    public void voice() {
        System.out.println("Parrot said - I want a cracker");
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "favouriteFruit='" + favouriteFruit + '\'' +
                '}';
    }
}
