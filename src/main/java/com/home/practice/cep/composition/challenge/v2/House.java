package com.home.practice.cep.composition.challenge.v2;

import java.util.List;

public class House {

    private List<Room> room;

    public House(List<Room> room) {
        this.room = room;
    }

    public List<Room> getRoom() {
        return room;
    }
}
