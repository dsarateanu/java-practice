package com.home.practice.cep.masterchallenge.v1.enums;

public enum BreadRoll {
    CIABATTA("ciabatta", 0.3),
    ENGLISHMUFFIN("english muffin", 0.5),
    SESAMESEEDBUN("sesame seed bun", 0.5),
    KAISER("kaiser", 0.4),
    PRETZEL("pretzel", 0.6),
    ONION("onion", 0.6),
    POTATO("potato", 0.5),
    BROWNRYE("brown rye", 0.6);

    private String name;
    private double price;

    BreadRoll(String name, double price) {
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
