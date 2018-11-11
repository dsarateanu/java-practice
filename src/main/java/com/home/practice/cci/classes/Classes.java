package com.home.practice.cci.classes;

public class Classes {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the ArrayChallenge class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        
        BankAccount bobsBankAccount = new BankAccount(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        System.out.println(bobsBankAccount.getAccountNumber());
        System.out.println(bobsBankAccount.getBalance());

        bobsBankAccount.withdrawal(100.0);

        bobsBankAccount.deposit(50.0);
        bobsBankAccount.withdrawal(100.0);

        bobsBankAccount.deposit(51.0);
        bobsBankAccount.withdrawal(100.0);
    }
}
