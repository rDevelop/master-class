package us.rlit.oop.challenges.master;

import java.util.ArrayList;

public class HealthyBurger extends Hamburger {
    private final ArrayList<Item> additionalItems = new ArrayList<>();
    private double cost;

    public HealthyBurger() {
        super("Healthy Burger","brown rye", "turkey", 5.00);
        super.setMaxItems(6);
    }
}
