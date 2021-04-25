package com.company.april11.zoo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private int price;
    private LocalDateTime timeAndDate;
    private Visitor visitor;

    public Order(int price, LocalDateTime timeAndDate, Visitor visitor) {
        this.price = price;
        this.timeAndDate = timeAndDate;
        this.visitor = visitor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");
        String formattedDate = formatter.format(this.timeAndDate);
        return "Order{" +
                "price=" + price +
                ", timeAndDate='" + formattedDate + '\'' +
                ", visitor=" + visitor +
                '}';
    }
}
