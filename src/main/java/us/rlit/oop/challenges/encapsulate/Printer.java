package us.rlit.oop.challenges.encapsulate;

public class Printer {

    private double tonerLevel;
    private int paperLevel;
    private int numberOfPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.paperLevel = 100;
    }

    public void fillToner(double amount) {
        if (tonerLevel == 100.0) {
            System.out.println("Toner Level is already full");
        } else if ((tonerLevel + amount) > 100) {
            double filled = amount - ((tonerLevel + amount) % 100);
            System.out.println("Added " + filled + " % of the " + amount + " you tried to fill.");
            tonerLevel += filled;
        } else {
            tonerLevel += amount;
            System.out.println("Added " + amount + " % of toner.");
        }
    }

    public double getTonerLevel() {
        System.out.println("Toner Level: " + tonerLevel);
        return tonerLevel;
    }

    public void print(int pages) {
        if(duplex) {
            numberOfPages = (pages / 2) + (pages % 2);
        } else {
            numberOfPages = pages;
        }
        double tonerNeeded = numberOfPages * .2;
        if( tonerNeeded > tonerLevel) {
            System.out.println("Ran out of toner.");
            double left = tonerLevel / .2;
            //numberOfPages = (int)(tonerLevel \ numberOfPages);
            tonerLevel = 0;
        }
        tonerLevel -= tonerNeeded;
        getTonerLevel();
        System.out.println("Printed " + numberOfPages + " pages");

    }


}
