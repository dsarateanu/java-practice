package com.home.practice.cfs.forStatement;

public class SumChallenge {

    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int sum = 0;
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by 3 and 5");
                sum += i;
                count++;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum " + sum);

    }
}
