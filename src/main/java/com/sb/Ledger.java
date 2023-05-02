package com.sb;

import static com.sb.AccountingLedgerApp.scanner;
import static com.sb.AccountingLedgerApp.transactions;
import static com.sb.Reports.showReports;

public class Ledger {
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
    public static void displayDeps(){}
    public static void displayPays(){}
}
