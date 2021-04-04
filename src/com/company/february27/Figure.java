package com.company.february27;

public class Figure {
    private double width;
    private double height;
    private Area area;

    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = new Area();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void info() {
        System.out.printf("Width: %.2f%nHeight: %.2f%nArea: %.3f%n", width, height, area.value);
    }

    public class Area {
        private double value;

        private Area() {
            this.value = width * height;
        }
    }
}
