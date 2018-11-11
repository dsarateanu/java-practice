package com.home.practice.escm.methods;

public class FeetToCentimeters {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double sum = -1d;
        if (feet >= 0 || (inches >= 0 && inches <= 12)) {
            sum = (feet * 12 + inches) * 2.54;
        }
        return sum;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet = -1;
        int rinches = -1;
        if (inches >= 0) {
            feet = (int) inches / 12;
            rinches = (int) inches % 12;
        }
        return calcFeetAndInchesToCentimeters(feet, rinches);
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(157));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }
}
