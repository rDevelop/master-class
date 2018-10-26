package us.rlit.arrays.challenge.banking;

import java.util.ArrayList;
import java.util.Objects;

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

    public Customer(String name, double transaction) {
        this.name = name;
        addTransaction(transaction);
    }

    public Boolean addTransaction(double transaction) {
        // unboxing total
        if( accountTotal + transaction < 0) {
            status = "Insufficient Funds";
            return false;
        }
        // boxing
        if(transactions.add(transaction)) {
            accountTotal += transaction;
            status = "Good Standing";
            return true;
        }
        status = "Unknown Error";
        return false;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
