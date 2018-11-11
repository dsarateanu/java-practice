package com.home.practice.cep.composition.challenge.v2;

public class Lamp {

    private boolean power;
    private String color;

    public Lamp(boolean power, String color) {
        this.power = power;
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
        System.out.println("Lamp power: " + this.power);
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
