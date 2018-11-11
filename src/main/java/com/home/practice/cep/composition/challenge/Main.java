package com.home.practice.cep.composition.challenge;

import com.home.practice.cep.composition.challenge.v1.*;
import com.home.practice.cep.composition.challenge.v2.House;
import com.home.practice.cep.composition.challenge.v2.Room;
import com.home.practice.cep.composition.challenge.v2.Table;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        //version2
        System.out.println();
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bedv1 = new Bed("Modern", 4, 3, 2, 1);

        Lamp lampv1 = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bedv1, lampv1);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

        // version1
        System.out.println();

        com.home.practice.cep.composition.challenge.v2.Bed bed = new com.home.practice.cep.composition.challenge.v2.Bed("Dormeo", 200, 180, 40);
        Table table = new Table("Oak", 100, 50, 100);
        com.home.practice.cep.composition.challenge.v2.Lamp lamp = new com.home.practice.cep.composition.challenge.v2.Lamp(false, "blue");

        Room room = new Room("bedroom", 500, 500, 300, table, bed, lamp);
        House house = new House(asList(room));

        Room roomFromHouse = house.getRoom().get(0);
        System.out.println(roomFromHouse.toString());
        roomFromHouse.getBed().setCompany("another company");
        roomFromHouse.getTable().setMaterial("cement");
        roomFromHouse.powerOnOffTheLamb();
        System.out.println(roomFromHouse.toString());
    }
}
