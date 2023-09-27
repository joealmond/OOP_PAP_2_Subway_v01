package com.codecool.model;

public abstract class OrderItem {

    String name;

    public OrderItem(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract double price();
}
