package com.sb;

import static com.sb.AccountingLedgerApp.scanner;

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
    public static void showReports(){
    //REPORT SUB-SCREEN
        short subInput;
        do{

            subInput = scanner.nextShort();

            System.out.println("\t1) Month to Date"); //
            System.out.println("\t2) Previous Month"); //
            System.out.println("\t3) Year to Date"); //
            System.out.println("\t4) Previous Year"); //
            System.out.println("\t5) Search by Vendor"); // user will be prompted for the vendor name
            System.out.println("\t0) Back."); // back to Report page


            switch(subInput){
                case 1: // Month To Date
                    break;
                case 2: // Previous Month
                    break;
                case 3: // Year To Date
                    break;
                case 4: // Previous Year
                    break;
                case 5: // Search by Vendor - prompts user for vendor name and display all entries for that vendor
                    break;
                case 0: // Go back to the report page
                    return;
                default: // Go back to the home page
                    System.out.println("Input command not found.");
            }

        } while (subInput != 0 );
    }
}
