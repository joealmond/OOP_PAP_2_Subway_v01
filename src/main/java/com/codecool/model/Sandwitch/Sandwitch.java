package com.codecool.model.Sandwitch;

import com.codecool.model.OrderItem;

import java.util.List;
import java.util.stream.Collectors;

public class Sandwitch implements OrderItem {

    private final List<SandwichIngredient> sandwitch;

    public Sandwitch(List<SandwichIngredient> sandwitch) {
        this.sandwitch = sandwitch;
    }

    @Override
    public double price() {
        return sandwitch
                .stream()
                .mapToDouble(SandwichIngredient::price)
                .sum();
    }

    @Override
    public String type() {
        return sandwitch.stream()
                .map(Enum::name)
                .collect(Collectors.joining(", "));
    }

}
