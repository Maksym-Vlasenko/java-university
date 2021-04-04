package com.company.march20.tasks;

public class ModernArmchair implements Armchair {
    @Override
    public int legsCount() {
        return 3;
    }

    @Override
    public void getInfo() {
        System.out.println("Legs count : " + legsCount());
        System.out.println("Style Modern");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType() {
        return FurnitureType.ARMCHAIR;
    }
}
