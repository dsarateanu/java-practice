package com.home.practice.cep.composition.challenge.v2;

public class Room {

    private String name;
    private int length;
    private int width;
    private int height;
    private Table table;
    private Bed bed;
    private Lamp lamp;

    public Room(String name, int lenght, int width, int height, Table table, Bed bed, Lamp lamp) {
        this.name = name;
        this.length = lenght;
        this.width = width;
        this.height = height;
        this.table = table;
        this.bed = bed;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int lenght) {
        this.length = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Table getTable() {
        return table;
    }

    public Bed getBed() {
        return bed;
    }

    public void powerOnOffTheLamb() {
        this.lamp.setPower(!this.lamp.isPower());
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", table=" + table.toString() +
                ", bed=" + bed.toString() +
                ", lamp=" + lamp.toString() +
                '}';
    }
}
