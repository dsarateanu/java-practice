package com.home.practice.cep.masterchallenge.v1;

import com.home.practice.cep.masterchallenge.v1.enums.Addition;
import com.home.practice.cep.masterchallenge.v1.enums.BreadRoll;
import com.home.practice.cep.masterchallenge.v1.enums.Meat;

import java.util.List;

public class HealtyBurger extends Hamburger {


    public HealtyBurger(Meat meat, List<Addition> additions) {
        super("Healthy Burger", BreadRoll.BROWNRYE, meat);
        this.addListOfAdditions(additions);
    }

    public HealtyBurger(Meat meat) {
        super("Healthy Burger", BreadRoll.BROWNRYE, meat);
    }
}
