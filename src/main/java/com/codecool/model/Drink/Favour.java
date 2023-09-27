package com.codecool.model.Drink;

public enum Favour {
    COCACOLA(50),
    FANTA(40),
    ICETEA(35);

    final double price;

    Favour(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }
}
