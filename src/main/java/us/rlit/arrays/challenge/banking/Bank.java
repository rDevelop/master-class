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

    private ArrayList<Branch> branches = new ArrayList<>();

    public boolean addBranch(Branch branch) {
        return branches.add(branch);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Branch branch = new Branch("South Branch");
        Branch b2 = new Branch("Chicago South");
        bank.addBranch(branch);
        bank.addBranch(b2);


        //todo could make a terminal input with menus to generate similar sequence of transactions.

        branch.addTransaction("Rob", 1_000.0);
        branch.addTransaction("Rob", 100.0);
        branch.addTransaction("Rob", 200014);
        branch.addTransaction("Pete", 3_000.0);
        branch.addTransaction("Pete", 300014);
        branch.addTransaction("Robert", 300.0);
        branch.addTransaction("Joe", -100.0);
        branch.addTransaction("Joe", 1.0);
        branch.addTransaction("Joe", -.2);
        branch.addTransaction("Joe", -20);


        b2.addTransaction("Rob", 1_000.0);
        b2.addTransaction("Robert", 300.0);
        b2.addTransaction("Joe", -100.0);
        b2.addTransaction("Joe", -20);


        bank.branches.forEach(
                b -> {b.printCustomers(true);}
        );

    }
}
