package com.home.practice.cfs.forStatement;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 10 exit the for loop
    // hint:  Use the break; statement to exit

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int numbers = 10;
        searchFirstPrimeNumbersFromInterval(min, max, numbers);
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void searchFirstPrimeNumbersFromInterval(int min, int max,int numbers) {
        int count = 0;

        for (int i = min; i < max; i++) {
            if (isPrime(i) == true) {
                System.out.println("Number " + i + " is prime.");
                count++;
            }

            if(count == numbers){
                System.out.println("Found " + numbers + " prime numbers.");
                break;
            }
        }

        System.out.println("Count: " + count);
    }

    public static int getLargestPrime(int number) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        if(number > 1){
            int checkedNumber = number;

        }

        return -1;
    }
}
