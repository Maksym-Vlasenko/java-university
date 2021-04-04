package com.company.march20;

public class SportBike implements Transport {
    private String model;
    private int width;

    public SportBike(String model, int width) {
        this.model = model;
        this.width = width;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void beep() {
        System.out.println("beep beep beep");
    }

    @Override
    public void run() {
        System.out.println("Sport bike rides");
    }
}
