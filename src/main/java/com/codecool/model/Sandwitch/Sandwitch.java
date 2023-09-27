package com.codecool.model.Sandwitch;

import com.codecool.model.OrderItem;

import java.util.List;

public class Sandwitch extends OrderItem {

    private final List<SandwichIngredient> sandwitch;

    public Sandwitch(String name, List<SandwichIngredient> sandwitch) {
        super(name);
        this.sandwitch = sandwitch;
    }

    @Override
    public double price() {
        return sandwitch
                .stream()
                .mapToDouble(SandwichIngredient::price)
                .sum();
    }
}
