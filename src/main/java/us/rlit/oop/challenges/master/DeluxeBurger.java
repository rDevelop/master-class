package us.rlit.oop.challenges.master;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String pop;

    public DeluxeBurger() {
        super("Big Mac","Sesame", "double patties",  8.50);
        setMaxItems(2);
        addAdditionalItem(new Item("Diet Coke", 1.75));
        addAdditionalItem(new Item("Doritoes", 2.00));
    }
}
