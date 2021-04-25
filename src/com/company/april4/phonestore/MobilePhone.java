package com.company.april4.phonestore;

public class MobilePhone {
    private String manufactory;
    private String model;
    private int year;
    private Display display;

    public MobilePhone(String manufactory, String model, int year, Display display) {
        this.manufactory = manufactory;
        this.model = model;
        this.year = year;
        this.display = display;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "manufactory='" + manufactory + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", display=" + display +
                '}';
    }
}
