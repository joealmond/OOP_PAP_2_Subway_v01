package com.codecool.model.Sandwitch;

public enum SandwichIngredient {
    BUN(10),
    MEAT(20),
    SALAD(5),
    CHESE(5);

    final double price;

    SandwichIngredient(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }
}
