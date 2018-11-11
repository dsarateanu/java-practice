package com.home.practice.cfs.switchStatement;

public class SwitchStatement {

    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("1");
                break;

            case 3: case 4: case 5:
                System.out.println("3,4,5");
                break;

            default:
                System.out.println("default");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchValueChar = 'E';
        switch (switchValueChar){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("C,D,E");
                break;

            default:
                System.out.println("default");
                break;
        }
    }
}
