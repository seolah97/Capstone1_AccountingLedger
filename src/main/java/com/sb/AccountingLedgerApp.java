package com.sb;
import java.util.ArrayList;
import java.util.Scanner;


import static com.sb.Ledger.displayLedger;
import static com.sb.Transactions.addDeposit;
import static com.sb.Transactions.makePayment;

public class AccountingLedgerApp {
    // Create static methods
    static ArrayList<Transactions> transactions = new ArrayList<Transactions>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Home Screen
        // Initialize variable for user input
        String input;
        // Make a do/while statement until Exit(X)
        do {
            System.out.println("Account Ledger Home Screen");
            System.out.println("\nWhat would you like to do?");
            System.out.println("\tTo make a deposit: D");
            System.out.println("\tTo make a payment: P");
            System.out.println("\tTo view the ledger: L");
            System.out.println("\tEnter X to exit");
            System.out.println("");
            System.out.print("Enter a Command: ");

            input = scanner.nextLine();
            // Create switch statement that handles cases related to each menu item
            switch (input) {
                case "D":     // D) Add Deposit -
                    // prompt user for the deposit information and save it to the csv file
                    addDeposit();
                    break;
                case "P":    // P) Make Payment (Debit)
                    // prompt user for the debit information and save it to the csv file
                    makePayment();
                case "L":    // L) Ledger - display the ledger screen
                    displayLedger();
                    break;
                case "X":   // X) Exit - exit the application
                    System.out.println("Exiting Ledger Application.");
                default:
                    System.out.println("Not a valid command. ");
            }
        } while (!input.equalsIgnoreCase("X"));



    }
}
