package us.rlit.innerclasses.nonstatic.nested;

import java.util.ArrayList;

public class GearBox {
    // Gear Box
    private ArrayList<Gear> gears;
    private int maxGears;
    //private int gearNumber = 0;
    private int currentGear;
    private boolean cluthIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        for(int i=0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

/*
Original Gear
 */
    // if it is private class Main couldn't access this directly
//    public class Gear {
//        // shadowing the GearBox var
//        private int gearNumber;
//        private double ratio;
//
//        public Gear(int gearNumber, double ratio) {
//            this.gearNumber = gearNumber;
//            this.ratio = ratio;
//        }
//
//        public double driveSpeed(int revs) {
//            return revs * this.ratio;
//        }
//    }

    public void operateClutch(boolean in) {
        this.cluthIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if(number > 0 && number <= maxGears ) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear>=0 && (newGear < this.gears.size())
        && this.cluthIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");

        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(cluthIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // Great way to encapsulate and hide anything from
    // knowing about Gear except GearBox.
    private class Gear {
        // shadowing the GearBox var
        private int gearNumber;
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
