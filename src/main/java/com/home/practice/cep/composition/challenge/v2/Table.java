package com.home.practice.cep.composition.challenge.v2;

public class Table {

    private String material;
    private int lenght;
    private int width;
    private int height;

    public Table(String material, int lenght, int width, int height) {
        this.material = material;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
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

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", lenght=" + lenght +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
