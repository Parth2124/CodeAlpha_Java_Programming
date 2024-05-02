
// CodeAlpha
// @CodeAlpha

// Task - 2

/*  Online Quiz Platform

A Simple Banking Application in Java is an ideal project
for coding beginners. It covers fundamental concepts
like the Scanner class for input, strings, loops, methods,
and conditional statements. This project involves basic
banking operations such as deposits, withdrawals,
checking balances, and exiting the program */

import java.util.Scanner;

public class TASK_2 {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount("Parth khanna", "2004");

        bank.chooseoption();
    }

}

class BankAccount {
    int balance;
    String CustomerName;
    String CustomerID;

    BankAccount(String cname, String cid) { // Constructer
        CustomerName = cname;
        CustomerID = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
        }
    }

    void withdraw(int amount) {
        if (balance != 0) {
            if (amount != 0) {
                balance = balance - amount;
            }
        }
    }

    void chooseoption() {
        char option = '\0'; // this represnt null
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + CustomerName + " Sir ");
        System.out.println("Your ID: " + CustomerID);
        System.out.println();

        System.out.println("A. Check Balance");
        System.out.println("B. Deposit Amount");
        System.out.println("C. Withdraw Amount");
        System.out.println("D. Exit");

        do {
            System.out.println("===============================================");
            System.out.print("Enter your choice: ");
            option = sc.next().toUpperCase().charAt(0); // input converting to uppercase take position and index 0;

            switch (option) {
                case 'A':
                    System.out.println("Your Balance is: " + balance);
                    break;
                case 'B':
                    System.out.println("Enter the amount to deposit: ");
                    int amount1 = sc.nextInt();
                    deposit(amount1);
                    break;
                case 'C':
                    System.out.println("Enter the amount to Withdraw: ");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    break;
                case 'D':
                    System.out.println("=====================");
                    System.out.println("Thank you for using our services!!");
                    System.out.println("=====================");
                    break;

                default:
                    System.out.println("Invalid choice!! choose from the given options!!");
                    break;
            }
        } while (option != 'D');
        sc.close();
    }
}