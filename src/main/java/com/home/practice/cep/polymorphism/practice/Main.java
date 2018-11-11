package com.home.practice.cep.polymorphism.practice;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println(movie.toString());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 4) + 1;

        switch (randomNumber){
            case 1: return new Jaws();
            case 2: return new IndependenceDay();
            case 3: return new Forgetable();
            case 4: return new StarWars();
            default: return null;
        }
    }
}
