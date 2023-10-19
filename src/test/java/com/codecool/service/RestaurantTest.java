package com.codecool.service;

import com.codecool.model.Drink.Drink;
import com.codecool.model.Drink.Favour;
import com.codecool.model.Sandwitch.SandwichIngredient;
import com.codecool.model.Sandwitch.Sandwitch;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    private Restaurant restaurant;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        restaurant = new Restaurant("Subway");
    }
    @Test
    void testCalculateIncome() {
        // plusz _esetnév

        // arrange
        Drink cola = new Drink(Favour.COCACOLA);
        Sandwitch burger = new Sandwitch(List.of(SandwichIngredient.BUN, SandwichIngredient.MEAT, SandwichIngredient.SALAD),"Meat");
        restaurant.addOrder(cola);
        restaurant.addOrder(burger);

        //act
        double income = restaurant.calculateIncome();

        // assert
        assertEquals(85,income);

    }

}