package com.home.practice.cep.masterchallenge.v1;

import com.home.practice.cep.masterchallenge.v1.enums.Addition;
import com.home.practice.cep.masterchallenge.v1.enums.BreadRoll;
import com.home.practice.cep.masterchallenge.v1.enums.Meat;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String name;
    private BreadRoll breadRoll;
    private Meat meat;
    private List<Addition> additions;
    private double price;

    public Hamburger(String name, BreadRoll breadRoll, Meat meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.additions = new ArrayList<>();
        this.meat = meat;
        this.price = breadRoll.getPrice() + meat.getPrice();

        System.out.println("Hamburger " + this.name + " costs " + this.price);
    }

    public Hamburger(String name, BreadRoll breadRoll, Meat meat, List<Addition> additions) {
        this.name = name;
        this.breadRoll = breadRoll;
        for (Addition addition : additions) {
            this.additions.add(addition);
        }
        this.meat = meat;
        this.price = breadRoll.getPrice() + meat.getPrice();

        System.out.println("Hamburger " + this.name + " costs " + this.price);
    }

    public void addAdditions(Addition addition) {
        if(addition != null){
            if ((this.additions.size() < 4 && !this.name.equals("Healthy Burger") && !this.name.equals("Deluxe Burger"))
                    || (this.additions.size() < 6 && this.name.equals("Healthy Burger"))
                    || (this.additions.size() < 2 && this.name.equals("Deluxe Burger"))) {
                this.additions.add(addition);
                this.price += addition.getPrice();
                System.out.println("Hamburger " + this.name + " costs " + this.price + " because added some addition that costs " + addition.getPrice());
            } else {
                System.out.println("The limit of additions has been reached.");
            }
        } else {
            System.out.println("The addition is null");
        }
    }

    public void addListOfAdditions(List<Addition> additions) {
        if (!additions.isEmpty() || additions != null) {
            for (Addition addition : additions) {
                this.addAdditions(addition);
            }
        } else {
            System.out.println("The list of additions is empty or null");
        }
    }
}
