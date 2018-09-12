package us.rlit.oop.constructors;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Big Cat of customer consructor");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "NA");
        System.out.println("Double cat constructor");
    }

    public VipCustomer() {
        this("NEW ACCOUNT", 0.0, "NA");
        System.out.println("Empty cat constructor");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
