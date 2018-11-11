package com.home.practice.escm;

public class KeywordsExpressions {

    //List of keywords - https://en.wikipedia.org/wiki/List_of_Java_keywords

    public static void main(String[] args) {

        // Define expressions and statements

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code that I will type below, write down what parts of the code are expressions.
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score");
            score = 0;
        }

        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }


        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
