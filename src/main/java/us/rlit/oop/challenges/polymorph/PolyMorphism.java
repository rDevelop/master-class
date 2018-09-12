package us.rlit.oop.challenges.polymorph;


class Car {
    private String name;
    private boolean running;
    private int cylinders;
    private int wheels;
    private int topSpeed;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        running = false;
        wheels = 4;
        topSpeed = 120;
    }

    public void startEngine() {
        running = true;
        System.out.println("Starting car.");
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }

    public void breaking() {
        System.out.println("Car breaking.");
        running = false;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return running;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}


class Oddessy extends Car {
    public Oddessy() {
        super(6, "Oddessy");
    }

    @Override
    public void startEngine() {
        System.out.println("Had vob near, pressed Start. Car's running");
        setRunning(true);

    }

    @Override
    public void accelerate() {
        if(!isRunning()) {
            System.out.println("Would help if your car was running.");
            startEngine();
            accelerate();
        } else {
            System.out.println("We're starting slow, but quickly hit a higher gear to speed up.");
        }

    }
}


class Vette extends Car {
    public Vette() {
        super(8, "Vette");
    }

    public void accelerate() {
        if(!isRunning()) {
            startEngine();
            accelerate();
        } else {
            System.out.println("Holy cow, the tires smoke and you fly forward.");
        }
    }

    public void breaking() {
        if(!isRunning()) {
            System.out.println("Relax partner, your ride is over and you're stopped");
        } else {
            System.out.println("Your skidding to a stop");
        }
    }


}

public class PolyMorphism {

    public static void main(String[] args) {

        Oddessy momsCar = new Oddessy();
        Vette dadsCar = new Vette();

        System.out.println("They're off to work.");
        System.out.println("Mom");
        momsCar.accelerate();

        System.out.println("Dad");
        dadsCar.accelerate();

    }
}

