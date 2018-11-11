package com.home.practice.al.array;

import java.util.Scanner;

public class Arrays {

    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printElementsFromArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));

        // Challenge
        int[] sortedIntegers = sortIntegers(myIntegers);
        printElementsFromArray(sortedIntegers);
    }

    public static int[] sortIntegers(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i; j < values.length - 1; j++) {
                if (values[i] < values[j + 1]) {
                    int aux = values[i];
                    values[i] = values[j + 1];
                    values[j + 1] = aux;
                }
            }
        }
        return values;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static void printElementsFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }
}
