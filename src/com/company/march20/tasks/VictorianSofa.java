package com.company.march20.tasks;

public class VictorianSofa implements Sofa {
    @Override
    public int pillowCount() {
        return 18;
    }

    @Override
    public void getInfo() {
        System.out.println("Pillow count : " + pillowCount());
        System.out.println("Style Victorian");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType() {
        return FurnitureType.SOFA;
    }
}
