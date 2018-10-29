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

    public Branch(String name) {
        this.name = name;
    }

    public boolean addCustomer(String customer) {
        Customer newCustomer = findCustomer(customer);
        if( newCustomer == null) {
            return customers.add(new Customer(customer));
        }
        System.out.println("Customer already exists.");
        return false;
    }

    public boolean addTransaction(String customerName, double transaction) {
        Customer c = findCustomer(customerName);
        if (c == null) {
            System.out.println("Can't find customer.");
            return false;
        }

        if (c.addTransaction(transaction)) {
            System.out.println(transaction + " applied to " + c.getName() + "'s account");
        }

        return true;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName() == name) {
                return customers.get(i);
            }
        }
        return null;

    }

    public String getName() {
        return name;
    }


    public void printCustomers(Boolean showTransactions) {
        String caption = showTransactions ? name + " customers and transactions:" : name + " customers:";
        System.out.println("\n\n" + caption);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName()
                    + " Account status: " + customers.get(i).getStatus()
                    + " Account Balance: " + customers.get(i).getAccountTotal());
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
}
