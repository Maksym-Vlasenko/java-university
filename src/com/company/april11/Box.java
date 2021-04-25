package com.company.april11;

import java.util.ArrayList;
import java.util.List;

public class Box<V> {
    private final List<V> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addElement(V element) {
        this.items.add(element);
    }

    public boolean removeElement(V element) {
        return this.items.remove(element);
    }
}
