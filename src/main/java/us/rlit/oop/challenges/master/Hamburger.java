package us.rlit.oop.challenges.master;

import java.util.ArrayList;

public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    private double cost;
    private ArrayList<Item> additionalItems = new ArrayList<>(4);
    private int maxItems;


    public Hamburger(String name, String bread, String meat, double cost) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.cost = cost;
        this.maxItems = 4;
    }

    public double getCost() {
        for(int i = 0; i < additionalItems.size(); i++) {
            cost += additionalItems.get(i).getCost();
        }
        return cost;
    }

    public String getItemizedPrices() {
        StringBuffer b = new StringBuffer();
        b.append(name + " " + bread + " " + meat + ": ");
                b.append(String.format("$%.2f\n", cost));
        if(additionalItems.size() != 0) {
            for(int i = 0; i< additionalItems.size(); i++ ) {
                Item item = additionalItems.get(i);
                b.append(" " + item.getName() + ": " + String.format("$%.2f\n", item.getCost()));
            }
        }
        b.append("Total: " + String.format("$%.2f\n", getCost()));
        return b.toString();
    }

    public boolean addAdditionalItem(Item item) {
        if(additionalItems.size() > maxItems -1 ) {
            System.out.println(getClass().getSimpleName() + " Can't add additional item: " + item.getName());
            return false;
        }
        return additionalItems.add(item);
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public void setAdditionalItems(ArrayList items) {
        this.additionalItems = items;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append( meat + " patty " );
        b.append("on a " + bread + " bun");
        return b.toString();
    }
}
