package com.company.april4.phonestore;

public class Display {
    private int widht;
    private int height;
    private int dpi;

    public Display(int widht, int height, int dpi) {
        this.widht = widht;
        this.height = height;
        this.dpi = dpi;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Display{" +
                "widht=" + widht +
                ", height=" + height +
                ", dpi=" + dpi +
                '}';
    }
}
