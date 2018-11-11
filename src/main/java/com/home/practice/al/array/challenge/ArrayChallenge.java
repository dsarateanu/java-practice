package com.home.practice.al.array.challenge;

import static com.home.practice.al.array.Arrays.getIntegers;
import static com.home.practice.al.array.Arrays.printElementsFromArray;
import static java.lang.Integer.MAX_VALUE;

public class ArrayChallenge {

    public static void main(String[] args) {
        // challenge min element
        int[] integers = getIntegers(5);

        System.out.println("Min number from array: " + findMin(integers));

        printElementsFromArray(reverse(integers));
        printElementsFromArray(reverseNewVersion(integers));
    }

    public static int findMin(int[] numbers) {
        int min = MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int[] reverse(int[] numbers) {
        int[] reverseArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - i - 1) {
                reverseArray[i] = numbers[i];
            } else {
                reverseArray[i] = numbers[numbers.length - i - 1];
            }
        }
        return reverseArray;
    }

    private static int[] reverseNewVersion(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }

        return array;
    }

}
