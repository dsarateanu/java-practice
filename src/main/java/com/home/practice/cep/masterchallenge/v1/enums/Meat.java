package com.home.practice.cep.masterchallenge.v1.enums;

public enum Meat{
    CHICKEN("chicken", 1.3),
    BEEF("beef", 2.0),
    PORK("pork", 1.8);

    private String name;
    private double price;

    Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
