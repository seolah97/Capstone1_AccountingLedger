package com.sb;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

import static com.sb.Reports.showReports;
import static com.sb.Transactions.addDeposit;
import static com.sb.Transactions.makePayment;

public class AccountingLedgerApp {
    // Create static methods
    static ArrayList<Transactions> transactions = new ArrayList<Transactions>();
    static Scanner scanner = new Scanner(System.in);
    static boolean append;
    static FileWriter writer;
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

    public static void displayLedger(){
        String input;
        do { //Ledger - All entries should show the newest entries first
            System.out.println("Ledger");
            System.out.println("\tA) View All Transactions"); //Display all entries
            System.out.println("\tD) View All Deposits"); //Displays only Deposits
            System.out.println("\tP) View All Payments"); //Display only the negative entries (or payments)
            System.out.println("\tR) View Reports");// R) Reports - A new screen that allows the user to run pre-defined reports or to run a custom search
            System.out.println("\tH) Go back to Home Screen");
            System.out.print("Command: ");

            input = scanner.nextLine();

            switch(input){ // Ledger Menu
                case "A":
                    displayAll(); // Runs custom static method called displayAll
                    break;
                case "D":
                    displayDeps();  // Runs custom static method called displayDeps
                    break;
                case "P":
                    displayPays(); // Runs custom static method called displayPays
                    break;
                case "R":
                    showReports(); // Runs custom static method called runReports
                    break;
                case "H":
                    break;
                default:
                    System.out.println("Input command not found.");
            }

        } while (!input.equalsIgnoreCase("H"));

    }

    public static void displayAll(){
        for (Transactions currentTransactions : transactions) {
            System.out.println(currentTransactions);
        }
    }

    public static void displayDeps(){

    }

    public static void displayPays(){

    }


}
