package com.codecool.service;

import com.codecool.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    String name;
    private final List<OrderItem> orders;

    public Restaurant(String name) {
        orders = new ArrayList<>();
        this.name = name;
    }

    public void addOrder(OrderItem item) {
        orders.add(item);
    }
    public void addAllOrderItem(List<OrderItem> orders) {
        this.orders.addAll(orders);
    }

    public double calculateIncome() {
        return orders
                .stream()
                .mapToDouble(OrderItem::price)
                .sum();
    }

}
