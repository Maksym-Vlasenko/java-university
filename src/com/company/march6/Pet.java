package com.company.march6;

import java.awt.*;
import java.util.Arrays;

public abstract class Pet {
    private String name;
    private int age;
    private Color[] colors;

    public Pet(String name, int age, Color[] colors){
        this.name=name;
        this.age=age;
        this.colors=colors;
    }
    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}
