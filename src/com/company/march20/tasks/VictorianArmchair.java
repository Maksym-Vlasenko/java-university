package com.company.march20.tasks;

public class VictorianArmchair implements Armchair {
    @Override
    public int legsCount() {
        return 4;
    }

    @Override
    public void getInfo() {
        System.out.println("Legs count : " + legsCount());
        System.out.println("Style Victorian");
        System.out.println("Type: " + getType() + "\n");
    }

    @Override
    public FurnitureType getType()  {
        return FurnitureType.ARMCHAIR;
    }
}

