package us.rlit.arrays.challenge.banking;


/**
 * It should have an arraylist of Branches
 * Add a new branch
 * Add a customer to that branch with initial transaction
 * Add a transaction for an existing customer for that branch
 * Show a list of customers for a particular branch and optionally a list of their transactions
 */
public class Application {


    public static void main(String[] args) {
        Bank bank = new Bank("Bank Of Chicago");
        if (bank.addBranch("South Branch")) {
            System.out.println("Created branch South Branch.");
        }
        if (bank.addBranch("Elgin Savings")) {
            System.out.println("Added branch Elgin Savings.");
        }


        //todo could make a terminal input with menus to generate similar sequence of transactions.
        bank.addCustomer("South Branch", "Rob");
        bank.addCustomer("South Branch", "Robert");
        bank.addCustomer("South Branch", "Pete");
        bank.addCustomer("South Branch", "Joe");


        bank.addTransaction("South Branch", "Rob", 1_000.0);
        bank.addTransaction("South Branch", "Rob", 100.0);
        bank.addTransaction("South Branch", "Rob", 200014);
        bank.addTransaction("South Branch", "Pete", 3_000.0);
        bank.addTransaction("South Branch", "Pete", 300014);
        bank.addTransaction("South Branch", "Robert", 300.0);
        bank.addTransaction("South Branch", "Joe", -100.0);
        bank.addTransaction("South Branch", "Joe", 1.0);
        bank.addTransaction("South Branch", "Joe", -.2);
        bank.addTransaction("South Branch", "Joe", -20);


        bank.addCustomer("Elgin Savings", "Rob");
        bank.addCustomer("Elgin Savings", "Robert");
        bank.addCustomer("Elgin Savings", "Joe");
        bank.addCustomer("Elgin Savings", "Rob");
        bank.addCustomer("Elgin Savings", "Tom");

        bank.addTransaction("Elgin Savings", "Rob", 1_000.0);
        bank.addTransaction("Elgin Savings", "Robert", 300.0);
        bank.addTransaction("Elgin Savings", "Joe", 102.0);
        bank.addTransaction("Elgin Savings", "Joe", -100.0);
        bank.addTransaction("Elgin Savings", "Joe", -18.01);
        bank.addTransaction("Elgin Savings", "Joe", 16.05);

        bank.addTransaction("Elgin Savings", "Tom", 1000);

        bank.listCustomers("Elgin Savings", true);
        bank.listCustomers("South Branches", false);

        bank.listAllBranchesCustomers(true);

    }
}
