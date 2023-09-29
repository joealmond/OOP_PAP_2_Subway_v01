package com.codecool.model.Sandwitch;

import com.codecool.model.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sandwitch implements OrderItem {

    private final List<SandwichIngredient> ingredients;

    public Sandwitch(List<SandwichIngredient> ingredients) {
        // megtöri az enkapszulációt a lista létrahozója fogja birtokolni ha nem másolod
        this.ingredients = new ArrayList<>(ingredients);
        // .add .remove
    }

    @Override
    public double price() {
        return ingredients
                .stream()
                .mapToDouble(SandwichIngredient::price)
                .sum();
    }

    @Override
    public String type() {
        // legyen name
        return ingredients.stream()
                .map(Enum::name)
                .collect(Collectors.joining(", "));
    }

}
