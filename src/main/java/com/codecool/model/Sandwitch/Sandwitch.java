package com.codecool.model.Sandwitch;

import com.codecool.model.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sandwitch extends OrderItem {

    private final List<SandwichIngredient> ingredients;

    public Sandwitch(List<SandwichIngredient> ingredients, String name) {
        // megtöri az enkapszulációt ha nem másolod!! a lista létrehozója fogja birtokolni a listát (reference!)
        super(name);
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
