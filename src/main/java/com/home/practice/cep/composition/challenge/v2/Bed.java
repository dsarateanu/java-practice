package com.home.practice.cep.composition.challenge.v2;

public class Bed {

    private String company;
    private int lenght;
    private int width;
    private int height;

    public Bed(String company, int lenght, int width, int height) {
        this.company = company;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
        return "Bed{" +
                "company='" + company + '\'' +
                ", lenght=" + lenght +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
