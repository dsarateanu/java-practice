package com.home.practice.cep.polymorphism.practice;

public class Movie {

    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                "plot='" + this.plot() + '\'' +
                '}';
    }
}
