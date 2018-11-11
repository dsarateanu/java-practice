package com.home.practice.cfs.whileStatement;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;

        if (number < 0) {
            number = -number;
        }
        int initialNumber = number;

        while (number > 0) {
            reverseNumber *= 10;
            int digit = number % 10;
            number /= 10;
            reverseNumber += digit;
        }

        return initialNumber == reverseNumber;
    }
}
