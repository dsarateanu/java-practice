package com.home.practice.cfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your year of birth: ");
//        Integer age = 2018 - scanner.nextInt();
//
//        System.out.println("Your name is " + name + " and you have " + age + " years old.");

          // reading input challenge
//        int sum = 0;
//        for (int i = 1; i<= 10; i++){
//            System.out.println("Enter number #" + i + ": ");
//            if(scanner.hasNextInt()){
//                sum += scanner.nextInt();
//            } else {
//                System.out.println("Invalid Number");
//            }
//        }
//
//        System.out.println("Sum: " + sum);

        // Min max challenge
        Integer min = MAX_VALUE;
        Integer max = MIN_VALUE;

        System.out.println("Enter numbers:");
        while (true){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();

                if(number <= min){
                    min = number;
                }

                if(number >= max){
                    max = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }

        System.out.println("Min value: " + min + ", Max value: " + max);

        scanner.close();
    }
}
