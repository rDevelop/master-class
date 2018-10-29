package us.rlit.arrays.challenge.banking;


import java.util.ArrayList;

/**
 * It should have an arraylist of Branches
 * Add a new branch
 * Add a customer to that branch with initial transaction
 * Add a transaction for an existing customer for that branch
 * Show a list of customers for a particular branch and optionally a list of their transactions
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addTransaction(String branch, String customer, double transaction) {
        Branch thisBranch = findBranch(branch);

        if (branch != null) {
            thisBranch.addTransaction(customer, transaction);
            return true;
        }
        System.out.println(branch + " does't exist.");


        return false;
    }

    public void listCustomers(String branch, boolean showTransactions) {
        findBranch(branch).printCustomers(showTransactions);
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName() == name) {
                return branches.get(i);
            }
        }
        return null;
    }

    public void listAllBranchesCustomers(boolean showTransactions) {
        // print all branches
        branches.forEach(
                b -> b.printCustomers(showTransactions)
        );
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            System.out.println(name + " already exists.");
            return false;
        }
        return branches.add(new Branch(name));
    }
}
