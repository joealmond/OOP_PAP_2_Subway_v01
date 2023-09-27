package com.codecool.view;

import java.util.List;

public class Console {
    public static void print(String info, String value) {
        System.out.println(info + ": " + value);
    }
    public static void print(String info) {
        System.out.println(info);
    }

    public static void printStatistics(List<String> stats) {
        for (String stat : stats) {
            print(stat);
        }

    }
}
