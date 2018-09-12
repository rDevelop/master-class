package us.rlit.oop.constructors;

public class Bank {
    public static void main(String[] args) {
        VipCustomer rob = new VipCustomer();
        Account account1 = new Account();
        account1.setCustomerName(rob.getName());
        account1.setCustomerEmail(rob.getEmailAddress());
        account1.setCustomerPhoneNumber("630-287-1694");
        account1.setNumber("81690358585");

        account1.withdraw(400.0);
        account1.deposit(5000.0);
        account1.withdraw(5000.0);

    

        System.out.println(account1);

        Account account2 = new Account("430240004");
        System.out.println(account2);

    }
}
