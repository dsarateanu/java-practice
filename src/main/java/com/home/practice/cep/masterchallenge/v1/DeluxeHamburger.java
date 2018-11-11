package com.home.practice.cep.masterchallenge.v1;

import com.home.practice.cep.masterchallenge.v1.enums.Addition;
import com.home.practice.cep.masterchallenge.v1.enums.BreadRoll;
import com.home.practice.cep.masterchallenge.v1.enums.Meat;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(BreadRoll breadRoll, Meat meat) {
        super("Deluxe Burger", breadRoll, meat);
        this.addAdditions(Addition.CHIPS);
        this.addAdditions(Addition.DRINK);
    }
}
