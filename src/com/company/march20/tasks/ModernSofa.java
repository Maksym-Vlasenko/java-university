package com.company.march20.tasks;

public class ModernSofa implements Sofa {
    @Override
    public int pillowCount() {
        return 5;
    }

    @Override
    public void getInfo() {
        System.out.println("Pillow count : " + pillowCount());
        System.out.println("Style Modern");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType() {
        return FurnitureType.SOFA;
    }
}
