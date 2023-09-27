package com.codecool;

import com.codecool.model.Drink.Drink;
import com.codecool.model.Sandwitch.Sandwitch;
import com.codecool.service.Restaurant;

import java.util.List;

import static com.codecool.view.Console.*;
import static com.codecool.model.Sandwitch.SandwichIngredient.*;
import static com.codecool.model.Drink.Favour.*;

public class Application {
    public static void main(String[] args) {

        Drink cola = new Drink(COCACOLA);

        Sandwitch normalBurger = new Sandwitch("Normal Burger", List.of(BUN, MEAT, SALAD));

        Restaurant subway = new Restaurant("Subway");

        subway.addAllOrderItem(List.of(normalBurger,cola));
        subway.addOrder(cola);

        print(subway.getStatistics());
    }
}