package com.company.march6;

import java.awt.*;

public class Falcon extends Bird {
    private String favouriteMeat;

    public Falcon(String name, int age, Color[] colors, BirdType bird, String favouriteMeat) {
        super(name, age, colors, bird);
        this.favouriteMeat = favouriteMeat;
    }

    public String getFavouriteMeat() {
        return favouriteMeat;
    }

    public void setFavouriteMeat(String favouriteMeat) {
        this.favouriteMeat = favouriteMeat;
    }

    @Override
    public void voice() {
        System.out.println("Falcon said - kar");
    }

    @Override
    public String toString() {
        return "Falcon{" +
                "favouriteMeat='" + favouriteMeat + '\'' +
                '}';
    }
}
