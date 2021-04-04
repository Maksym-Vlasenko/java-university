package com.company.march6;

import java.awt.*;

public class DecorativeDog extends Dog {
    private String favouriteToy;

    public DecorativeDog(String name, int age, Color[] colors, DogBread bread, String favouriteToy){
        super(name, age, colors, bread);
        this.favouriteToy=favouriteToy;
    }

    @Override
    public void voice() {
        System.out.printf("Dog said - WOOF");
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    @Override
    public String toString() {
        return "DecorativeDog{" +
                "favouriteToy='" + favouriteToy + '\'' +
                '}';
    }
}
