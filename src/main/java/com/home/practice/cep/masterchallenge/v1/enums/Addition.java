package com.home.practice.cep.masterchallenge.v1.enums;

public enum  Addition {
    LETTUCE("lettuce", 1.0),
    TOMATO("tomato", 0.9),
    CARROT("carrot", 0.8),
    AVOCADO("avocado", 1.0),
    ROCKET("rocket", 1.2),
    ONION("onion", 1.0),
    CARAMELIZEDONION("caramelized onion", 1.2),
    CHEESE("cheese", 1.0),
    BLUECHEESE("blue cheese", 1.3),
    HALLOUMICHEESE("halloumi cheese", 1.2),
    DRINK("drink", 2),
    CHIPS("chips", 1);

    private String name;
    private double price;

    Addition(String name, double price) {
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
