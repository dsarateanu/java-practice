package com.home.practice.escm.methods;

public class Methods {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get into position " + position + " on the high score table.");
    }

    public static void displayHighScore(String name, int score) {
        System.out.println("Player " + name + " managed to get score " + score);
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        displayHighScore("Dan", calculateScore(gameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        displayHighScore("Mike", calculateScore(gameOver, score, levelCompleted, bonus));


        System.out.println();
        int highScore = 1500;
        displayHighScorePosition("Daniel", calculateHighScorePosition(highScore));
        highScore = 900;
        displayHighScorePosition("Michel", calculateHighScorePosition(highScore));
        highScore = 400;
        displayHighScorePosition("John", calculateHighScorePosition(highScore));
        highScore = 50;
        displayHighScorePosition("Mark", calculateHighScorePosition(highScore));


    }

}
