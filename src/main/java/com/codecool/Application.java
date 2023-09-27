package com.codecool;

import com.codecool.model.Drink.Drink;
import com.codecool.model.Sandwitch.Sandwitch;
import com.codecool.service.Restaurant;

import java.util.List;

import static com.codecool.view.Console.print;
import static com.codecool.model.Sandwitch.SandwichIngredient.*;
import static com.codecool.model.Drink.Favour.*;

public class Application {
    public static void main(String[] args) {

        Drink cola = new Drink(COCACOLA);
        print("Drink:");
        print("Name", cola.name());
        print("Price",String.valueOf(cola.price()));

        Sandwitch normalBurger = new Sandwitch("Normal Burger", List.of(BUN, MEAT, SALAD));
        print("Buger:");
        print("Burger name",normalBurger.name());
        print("Burger price",String.valueOf(normalBurger.price()));

        Restaurant subway = new Restaurant("Subway");
        subway.addAllOrderItem(List.of(normalBurger,cola));
        subway.addOrder(cola);
        print("Income",String.valueOf(subway.calculateIncome()));

    }
}