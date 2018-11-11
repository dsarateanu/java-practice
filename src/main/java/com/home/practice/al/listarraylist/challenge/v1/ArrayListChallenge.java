package com.home.practice.al.listarraylist.challenge.v1;

import java.util.Scanner;

public class ArrayListChallenge {

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
    }

    public static void addItem() {
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name, phoneNumber);
    }

    public static void modifyItem() {
        System.out.print("Current contact name: ");
        String name = scanner.nextLine();
        System.out.print("Current contact phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("New contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Current contact phone number: ");
        String newPhoneNumber = scanner.nextLine();

        mobilePhone.modifyContact(name, phoneNumber, newName, newPhoneNumber);
    }

    public static void removeItem() {
        System.out.print("Remove contact with name: ");
        String name = scanner.nextLine();
        System.out.print("Remove contact with phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.removeContact(name, phoneNumber);
    }

    public static void searchForItem() {
        System.out.print("Search contact with name: ");
        String name = scanner.nextLine();
        System.out.print("Search contact with phone number: ");
        String phoneNumber = scanner.nextLine();
        int index = mobilePhone.findContact(name, phoneNumber);
        if(index != -1) {
            System.out.println("Found contact with name " + name + " and phone number " + phoneNumber);
        } else {
            System.out.println("Contact with name " + name + " and phone number " + phoneNumber + " not found.");
        }
    }

}
