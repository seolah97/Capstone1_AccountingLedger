package com.sb;

import static com.sb.AccountingLedgerApp.scanner;

public class Reports {
    public static void showReports() {
        //REPORT SUB-SCREEN
        short subInput;
        do {


            System.out.println("\t1) Month to Date"); //Shows entries from the current month to current date
            System.out.println("\t2) Previous Month"); // Shows entries from just the previous month
            System.out.println("\t3) Year to Date"); // Shows entries from the current year to the current date
            System.out.println("\t4) Previous Year"); // Shows just the entries from the previous year
            System.out.println("\t5) Search by Vendor"); // Prompt for vendor name, then display all entries from that vendor
            System.out.println("\t0) Back."); // back to Report page


            subInput = scanner.nextShort();
            switch (subInput) {
                case 1: // Month To Date
                    monthToDate();
                    break;
                case 2: // Previous Month
                    previousMonth();
                    break;
                case 3: // Year To Date
                    yearToDate();
                    break;
                case 4: // Previous Year
                    previousYear();
                    break;
                case 5: // Search by Vendor - prompts user for vendor name and display all entries for that vendor
                    searchByVendor();
                    break;
                case 0: // Go back to the report page
                    return;
                default: // Go back to the home page
                    System.out.println("Input command not found.");
            }

        } while (subInput != 0);
    }

    public static void monthToDate(){

    }
    public static void previousMonth(){

    }
    public static void yearToDate(){

    }
    public static void previousYear(){

    }
    public static void searchByVendor(){

    }
//        String date = "2023-04-15";
//        String time = "10:13:25";
//        String dateTime = date + " " + time; // "2023-04-15 10:13:25"
//        // 1: Create a pattern for the date
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
////        2: Parse/convert the date using the created pattern
//        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, dateTimeFormatter);
//
//        System.out.println(localDateTime);

}
