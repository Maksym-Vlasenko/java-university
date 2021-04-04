package com.company.november22;

public class Plane {
    private String model;
    public static int places;
    private static Plane instance;

    private Plane(String model) {
        this.model = model;
    }

    public Plane() {
        this.model = "Some model";
    }

    public static Plane create() {
        if (instance == null) {
            instance = new Plane();
        }
        return instance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", places=" + places +
                '}';
    }
}
