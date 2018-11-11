package com.home.practice.al.listarraylist.challenge.v1;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contact> contacts = new ArrayList<>();

    //store, modify, remove and query contact names
    public void addContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        this.contacts.add(contact);
    }

    public void modifyContact(String name, String phoneNumber, String modifiedName, String modifiedPhoneNumber){
        int indexContact = findContact(name, phoneNumber);
        if(indexContact >= 0) {
            this.contacts.set(indexContact, new Contact(modifiedName, modifiedPhoneNumber));
        }
    }

    public void removeContact(String name, String phoneNumber){
        int indexContact = findContact(name, phoneNumber);
        if(indexContact >= 0) {
            this.contacts.remove(indexContact);
        }

    }

    public int findContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        return this.contacts.indexOf(contact);
    }

    public void printContacts() {
        System.out.println("You have " + this.contacts.size() + " items in your contact list");
        for(int i=0; i< this.contacts.size(); i++) {
            System.out.println((i+1) + ". " + this.contacts.get(i).toString());
        }
    }
}
