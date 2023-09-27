package com.codecool.model.Drink;

import com.codecool.model.OrderItem;

public class Drink implements OrderItem {

    Favour favour;

    public Drink(Favour favour) {
        this.favour = favour;
    }

    @Override
    public double price() {
        return favour.price();
    }

    public String favour() {
        return favour.toString();
    }

}
