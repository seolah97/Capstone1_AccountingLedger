package com.sb;

import static com.sb.AccountingLedgerApp.scanner;

public class Reports {
    public static void showReports() {
        //REPORT SUB-SCREEN
        short subInput;
        do {

            subInput = scanner.nextShort();

            System.out.println("\t1) Month to Date"); //
            System.out.println("\t2) Previous Month"); //
            System.out.println("\t3) Year to Date"); //
            System.out.println("\t4) Previous Year"); //
            System.out.println("\t5) Search by Vendor"); // user will be prompted for the vendor name
            System.out.println("\t0) Back."); // back to Report page


            switch (subInput) {
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

        } while (subInput != 0);
    }
}
