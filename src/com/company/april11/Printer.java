package com.company.april11;

public class Printer<B> implements Printable<B> {
    @Override
    public void print(B element) {
        System.out.println(element);
    }
}