package com.company.february27;

public class LandlinePhone extends Phone {
    private int coverageRadius;

    public LandlinePhone(String model, String color, int number, int coverageRadius) {
        super(model, color, number);
        this.coverageRadius = coverageRadius;
    }

    public int getCoverageRadius() {
        return coverageRadius;
    }

    public void setCoverageRadius(int coverageRadius) {
        this.coverageRadius = coverageRadius;
    }

    @Override
    public String toString() {
        return "LandlinePhone = {" +
                "model = " + super.getModel() +
                ", color = " + super.getColor() +
                ", number = " + super.getNumber() +
                ", coverageRadius = " + this.coverageRadius +
                "}";
    }
}
