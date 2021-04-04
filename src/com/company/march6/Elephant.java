package com.company.march6;

import java.awt.*;
import java.util.Random;

public class Elephant extends Pet {
    private String kind;

    public Elephant(String name, int age, Color[] colors, String kind) {
        super(name, age, colors);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void voice() {
        System.out.println("Elephant said 'Hello'");
    }

    @Override
    public int hashCode() {
        return super.getAge() + new Random().nextInt() + super.getName().hashCode();
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj instanceof Elephant) {
            Elephant elephant = (Elephant) obj;
            return elephant.getName().equals(this.getName())
                    && elephant.getAge() == this.getAge();
        }
        return false;
    }*/
}
