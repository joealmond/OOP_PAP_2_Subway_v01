package com.codecool.service;

import com.codecool.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<OrderItem> orders;
    private final String name;

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

    public List<String> getStatistics() {
        List<String> statistics = new ArrayList<>();

        statistics.add("Restaurant name: " + name);
        statistics.add("Total Orders: " + orders.size());
        statistics.add("Total income: " + calculateIncome());

        int count = 0;
        for (OrderItem orderItem : orders) {
            statistics.add(
                            "item" + count + ": " + "\n" +
                            "Type: " + orderItem.getClass().getSimpleName() + "\n" +
                            "Name: " + orderItem.name() + "\n" +
                            "Price: " + orderItem.price()
            );
            count++;
        }

        return statistics;
    }

}
