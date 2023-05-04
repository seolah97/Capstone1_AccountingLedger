package com.sb;

import java.io.FileWriter;
import java.io.IOException;

import static com.sb.AccountingLedgerApp.*;

public class Transactions { // Payments and Deposits in here
    // Properties
    public String date;
    public static String time;
    public String desc;
    public String vendor;
    public float amount;

    //Constructor
    public Transactions(String date, String time, String desc, String vendor, float amount) {
        this.date = date;
        this.time = time;
        this.desc = desc;
        this.vendor = vendor;
        this.amount = amount;
    }

    //Getters and Setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction:" + date + "\\|" + time + "\\|" + desc + "\\|" + vendor + "\\|" + amount;
    }

    // Custom Methods

    public static void addDeposit(){
        // Prompt user for deposit info.
        System.out.println("Add Deposit");
        System.out.println("Type Date of Deposit as follows: (MM/DD/YY) ");
        String date = scanner.nextLine();

        System.out.println("Enter Time of the Deposit as follows (HH:MM:SS)");
        String time = scanner.nextLine();

        System.out.println("Brief Description of Deposit: ");
        String desc = scanner.nextLine();

        System.out.println("Vendor of the Deposit: ");
        String vendor = scanner.nextLine();

        System.out.println("Amount of the Deposit: ");
        float amount = scanner.nextFloat();
        scanner.nextLine();

        Transactions deposit = new Transactions(date, time, desc, vendor, amount);
        transactions.add(deposit);
        System.out.println("Your Deposit has been added Successfully!");

        // Save input into the csv file using try/catch and file writer
        try {
            writer = new FileWriter("./src/main/java/com/sb/transactions.csv", true);
            writer.write( "\nDeposit: " + date + " | " + time + " | " + desc + " | " + vendor + " | " + "$" + amount);
            writer.close();
        }catch (IOException e){
            System.out.println("Your Deposit was unsuccessful");
            throw new RuntimeException(e);
        }

    }

    public static void makePayment(){
        // Prompt user for payment info.
        System.out.println("Add Payment");
        System.out.println("Type Date of Payment as follows: (MM/DD/YY) ");
        String date = scanner.nextLine();

        System.out.println("Enter Time of the Payment as follows (HH:MM:SS)");
        String time = scanner.nextLine();

        System.out.println("Brief Description of Payment : ");
        String desc = scanner.nextLine();

        System.out.println("Vendor of the Payment: ");
        String vendor = scanner.nextLine();

        System.out.println("Amount of the Payment: ");
        float amount = scanner.nextFloat();
        float paymentAmount = amount * -1;

        scanner.nextLine();

        Transactions payments = new Transactions(date, time, desc, vendor, amount);
        transactions.add(payments);

        // Save input into the csv file using try/catch and file writer
        try {
            writer = new FileWriter("./src/main/java/com/sb/transactions.csv", true);
            writer.write( "\nPayments: " + date + " | " + time + " | " + desc + " | " + vendor + " | " + "$" + paymentAmount);
            writer.close();
        }catch (IOException e){
            System.out.println("Your Payment was unsuccessful");
            throw new RuntimeException(e);
        }

    }

}
