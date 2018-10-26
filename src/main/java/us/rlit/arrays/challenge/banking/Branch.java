package us.rlit.arrays.challenge.banking;

import java.util.ArrayList;

/**
 * Branch
 * Each Branch should have an arraylist of Customers
 * Need to be able to add a new customer and initial transaction amount.
 * Also needs to add additional transactions for that customer/branch
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch() {
        this.name = "New Branch";
    }

    public Branch(String name) {
        this.name = name;
    }

    private Boolean customerExists(Customer customer) {
        if (customers.contains(customer)) {
            return true;
        }
        return false;
    }

    private Boolean addCustomer(Customer customer) {
        if (customerExists(customer)) {
            return false;
        }
        return customers.add(customer);
    }

    public Boolean addTransaction(String customerName, double transaction) {
        Customer c = new Customer(customerName);
        if (!customerExists(c)) {
            addCustomer(c);
        } else {
            c = customers.get(customers.indexOf(c));
        }
        if( c.addTransaction(transaction) ) {
            System.out.println(transaction + " applied to " + c.getName() + "'s account");
        }  else {
            System.out.println(transaction + " was not applied to " + c.getName() + "'s account. status: " + c.getStatus());

        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCustomers(Boolean showTransactions) {
        String caption = showTransactions ? name + " customers and transactions:" : name + " customers:";
        System.out.println("\n\n"+ caption);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
            if (showTransactions) {
                ArrayList<Double> trans = customers.get(i).getTransactions();
                for (int j = 0; j < trans.size(); j++) {
                    // Unboxing
                    double amount = trans.get(j);
                    System.out.println(j + 1 + " : " + amount);

                }
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
