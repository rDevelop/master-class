package us.rlit.arrays.challenge.banking;

import java.util.ArrayList;

/**
 * The Customer class should have an arraylist of Doubles (transactions)
 * Name, and the ArrayList of doubles.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();
    private Double accountTotal = 0d;
    private String status = "Good Standing";

    public Customer(String name) {
        this.name = name;
    }

    public boolean addTransaction(double transaction) {
        // unboxing total
        accountTotal += transaction;
        if (accountTotal < 0) {
            status = "Insufficient Funds";
        } else {
            status = "Good Standing";
        }
        // boxing total
        if (transactions.add(transaction)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getStatus() {
        return status;
    }

    public Double getAccountTotal() {
        return accountTotal;
    }

}
