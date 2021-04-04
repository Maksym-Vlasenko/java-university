package com.company.march20.tasks;

public class ModernTable implements Table{
    @Override
    public int availablePlaces() {
        return 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Available places : " + availablePlaces());
        System.out.println("Style Modern");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType() {
        return FurnitureType.TABLE;
    }
}
