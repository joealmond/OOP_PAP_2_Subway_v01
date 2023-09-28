package com.codecool.model.Drink;

import com.codecool.model.OrderItem;

public class Drink implements OrderItem {

    private final Favour favour;

    public Drink(Favour favour) {
        this.favour = favour;
    }

    @Override
    public double price() {
        return favour.price();
    }
    @Override
    public String type() {
        return favour.toString();
    }

}
