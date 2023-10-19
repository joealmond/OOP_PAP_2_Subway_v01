package com.codecool.model;

public abstract class OrderItem {
    private final String name;

    protected OrderItem(String name) {
        this.name = name;
    }

    public abstract double price();
    public abstract String type();
}
