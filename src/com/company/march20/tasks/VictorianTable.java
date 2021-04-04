package com.company.march20.tasks;

public class VictorianTable implements Table {
    @Override
    public int availablePlaces() {
        return 14;
    }

    @Override
    public void getInfo() {
        System.out.println("Available places : " + availablePlaces());
        System.out.println("Style Victorian");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType() {
        return FurnitureType.TABLE;
    }
}

