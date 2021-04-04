package com.company;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private String brend;
    private int speed;

    public Car(String manufacturer, String model, String color, String brend, int speed) {
        this(manufacturer, model, brend, speed);
        this.color = color;

    }

    public Car(String manufacturer, String model, String brend, int speed) {
        this(manufacturer, brend, speed);
        this.model = model;
    }

    public Car(String manufacturer, String model, String color, String brend) {
        this(manufacturer, color, brend);
        this.model = model;
    }

    public Car(String manufacturer, String color, String brend) {
        this(manufacturer, color);
        this.brend = brend;
    }

    public Car(String manufacturer, String brend, int speed) {
        this(manufacturer, speed);
        this.brend = brend;
    }

    public Car(String manufacturer, int speed) {
        this.manufacturer = manufacturer;
        this.speed = speed;
    }

    public Car(String manufacturer, String color) {
        if (manufacturer != null) {
            this.manufacturer = manufacturer;
        } else {
            this.manufacturer = "No data";
        }
        this.color = color;
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrend() {
        return brend;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 100 && speed <= 500) {
            this.speed = speed;
        } else {
            System.out.println("speed must be between 100 and 500");
        }
    }

    @Override
    public String toString() {
        return "DescriptionCar{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brend='" + brend + '\'' +
                ", speed=" + speed +
                '}';
    }
}