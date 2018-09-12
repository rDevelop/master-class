package us.rlit.oop.challenges.master;

public class BillsBurgers {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Plain Burger","white", "beef", 3.5);


        hamburger.addAdditionalItem(new Item("Ketchup", .50));
        hamburger.addAdditionalItem(new Item("Mustard", .50));
        hamburger.addAdditionalItem(new Item("Lettuce", .25));
        hamburger.addAdditionalItem(new Item("Tomatoes", 1.0));
        hamburger.addAdditionalItem(new Item("Bacon", 1.50));
        hamburger.addAdditionalItem(new Item("Shit", 5.00));
        System.out.println(hamburger.getItemizedPrices());




        HealthyBurger hb = new HealthyBurger();
        hb.addAdditionalItem(new Item("Cheese", 2.0));
        hb.addAdditionalItem(new Item("Onion", .40));
        hb.addAdditionalItem(new Item("Baccon", .40));
        System.out.println(hb.getItemizedPrices());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAdditionalItem(new Item("Taco", 4.00));
        System.out.println(deluxeBurger.getItemizedPrices());
    }
}
