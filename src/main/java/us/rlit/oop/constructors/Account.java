package us.rlit.oop.constructors;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        this("NEWACCOUNT");
        System.out.println("Empty constructor...");
    }

    public Account(String number) {
        this(number, 0.0, "NA", "NA", "NA");
        System.out.println("Constructor with account only.");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("The big dog of constructors");
        this.number =  number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        System.out.println("deposit " + amount);
        balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public boolean withdraw(double amount) {
        System.out.println("withdraw " + amount);
        if(balance - amount >= 0) {
            balance -= amount;
            System.out.println("New Balance: " + balance);
            return true;
        }
        System.out.println(amount + " Exceeds balance: " + balance);
        return false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String accountNumber) {
        this.number = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append("customerName: " + customerName + "\n");
        b.append("accountNumber : "  + number + "\n");
        b.append("balance: " + balance + "\n");
        b.append("customerEmail: " + customerEmail + "\n");
        b.append("customerPhoneNumber number: " + customerPhoneNumber + "\n");
        return b.toString();
    }
}
