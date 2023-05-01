package com.sb;
import java.util.Scanner;

public class AccountingLedger {
    // Create static methods
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Home Screen
        // Initialize variable for user input
        String input;
        // Make a do/while statement until Exit(X)
        do {
            System.out.println("Account Ledger Home Screen");
            System.out.println("\nWhat would you like to do?");
            System.out.println("Enter D to make a deposit");
            System.out.println("Enter P to make a payment");
            System.out.println("Enter L to view the ledger");
            System.out.println("Enter X to exit");
            System.out.print("Enter a Command: ");

            input = scanner.nextLine();

        // Create switch statement that handles cases related to each menu item
        // D) Add Deposit -
        // prompt user for the deposit information and save it to the csv file
        // P) Make Payment (Debit)
        // prompt user for the debit information and save it to the csv file
        // L) Ledger - display the ledger screen
        // X) Exit - exit the application
        } while ();

        //Ledger - All entries should show the newest entries first
        // A) All - Display all entries
        // D) Deposits - Display only the entries that are deposits into the account
        // P) Payments - Display only the negative entries (or payments)
        // R) Reports - A new screen that allows the user to run pre-defined reports or to run a custom search
            // 1) Month To Date
            // 2) Previous Month
            // 3) Year To Date
            // 4) Previous Year
            // 5) Search by Vendor - prompt the user for the vendor name
            // and display all entries for that vendor
            // 0) Back - go back to the report page
                    // H) Home - go back to the home page

    }
}
