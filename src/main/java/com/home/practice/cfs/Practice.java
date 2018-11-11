package com.home.practice.cfs;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(sumFirstAndLastDigit(5));

        System.out.println();
        System.out.println(getEvenDigitSum(2532));

        System.out.println();
        System.out.println(hasSharedDigitGeneric(123, 3456));

        System.out.println();
        System.out.println(hasSharedDigitWithPrimitives(11, 32));

        System.out.println();
        System.out.println(getGreatestCommonDivisor(1010, 10));

        System.out.println();
        System.out.println(isPerfectNumber(6));

        System.out.println();
        printSquareStar(10);
    }

    public static int sumFirstAndLastDigit(int number) {
        boolean firstFlag = true;
        int sum = 0;
        int count = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            count++;

            if (firstFlag == true || number == 0) {
                sum += digit;
                firstFlag = false;
            }

            if (count == 1 && number == 0) {
                sum += digit;
            }
        }
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigitGeneric(int value1, int value2) {

        List<Integer> digits1 = new ArrayList();
        List<Integer> digits2 = new ArrayList();

        while (value1 > 0) {
            digits1.add(value1 % 10);
            value1 /= 10;
        }

        while (value2 > 0) {
            digits2.add(value2 % 10);
            value2 /= 10;
        }

        for (Integer d : digits1) {
            if (digits2.contains(d)) {
                return true;
            }
        }

        return false;
    }

    public static boolean hasSharedDigitWithPrimitives(int value1, int value2) {

        if (value1 < 10 || value1 > 99 || value2 < 10 || value2 > 99) {
            return false;
        }

        int[] digits1 = new int[2];
        int[] digits2 = new int[2];

        digits1[0] = value1 % 10;
        digits1[1] = value1 / 10 % 10;

        digits2[0] = value2 % 10;
        digits2[1] = value2 / 10 % 10;

        if (digits1[0] == digits2[0] || digits1[0] == digits2[1] || digits1[1] == digits2[0] || digits1[1] == digits2[1]) {
            return true;
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int max = 0;
        int number = 0;

        if (first > second) {
            number = second;
        } else {
            number = first;
        }

        for (int i = 2; i <= number; i++) {
            if (first % i == 0 && second % i == 0) {
                max = i;
            }
        }
        return max;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i == 1 || i == number) {
                    String stars = "*";
                    while (stars.length() != number) {
                        stars += "*";
                    }
                    System.out.println(stars);
                }

                if (i > 1 && i < number) {
                    String stars = "";
                    while (stars.length() != number) {
                        if (stars.length() == 0 || stars.length() == i-1 || stars.length() == number - i || stars.length() + 1 == number) {
                            stars += "*";
                        } else {
                            stars += " ";
                        }
                    }
                    System.out.println(stars);
                }
            }
        }
    }
}

