package com.codecool.model.Drink;

import com.codecool.model.OrderItem;

public class Drink extends OrderItem {

    Favour favour;

    public Drink(Favour favour) {
        super(favour.name());
        this.favour = favour;
    }

    @Override
    public double price() {
        return favour.price();
    }

}
