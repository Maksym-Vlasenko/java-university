package com.company.november22;

public class Fruit {
    private String sort;
    private int weight;

    public String getSort() {
        return sort;
    }

    public Fruit(String sort, int weight) {
        this.sort = sort;
        this.weight = weight;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "sort='" + sort + '\'' +
                ", weight=" + weight +
                '}';
    }
}
