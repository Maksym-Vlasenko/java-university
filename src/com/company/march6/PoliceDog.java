package com.company.march6;

import java.awt.*;
import java.util.Arrays;

public class PoliceDog extends Dog {
    private String policeDepartment;

    public PoliceDog(String name, int age, Color[] colors, DogBread bread, String policeDepartment) {
        super(name, age, colors, bread);
        this.policeDepartment = policeDepartment;
    }

    @Override
    public void voice() {
        System.out.printf("Dog said - WOOF");
    }

    public String getPoliceDepartment() {
        return policeDepartment;
    }

    public void setPoliceDepartment(String policeDepartment) {
        this.policeDepartment = policeDepartment;
    }

    public void gav() {
        System.out.println("Police dog said 'gav'");
    }

    @Override
    public String toString() {
        return "PoliceDog{" +
                "name=" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\'' +
                ", colors=" + Arrays.toString(super.getColors()) + '\'' +
                ", bread=" + super.getBread() + '\'' +
                ", policeDepartment='" + policeDepartment + '\'' +
                '}';
    }
}
