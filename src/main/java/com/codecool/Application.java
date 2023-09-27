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
        print("Favour", cola.favour());
        print("Price",String.valueOf(cola.price()));

        Sandwitch normalBurger = new Sandwitch(List.of(BUN, MEAT, SALAD));
        print("Buger:");
        print("Sandwich type",normalBurger.getSandwitchType());
        print("Sandwich price",String.valueOf(normalBurger.price()));

        Restaurant subway = new Restaurant("Subway");
        subway.addAllOrderItem(List.of(normalBurger,cola));
        subway.addOrder(cola);
        print("Restaurant Income",String.valueOf(subway.calculateIncome()));

    }
}