package com.sb;

import static com.sb.AccountingLedgerApp.scanner;

public class Transactions { // Payments and Deposits in here
    // Properties
    public String date;
    public String time;
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
        System.out.println("Type Date of Deposit as follows: HH:MM:SS ");
        String date = scanner.nextLine();

        System.out.println("Brief Description of Deposit: ");
        String desc = scanner.nextLine();

        System.out.println("Vendor of the Deposit: ");
        String vendor = scanner.nextLine();

        System.out.println("Amount of the Deposit: ");
        float amount = scanner.nextFloat();
        scanner.nextLine();

        // Save input into the csv file using try/catch and file writer

    }


    public static void makePayment(){

    }

}
