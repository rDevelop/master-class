package us.rlit.oop.composition.heritance.recap;

public class Car extends Vehicle {
    private int doors;
    private int engineSize;

    public Car(String name, int doors, int engineSize) {
        super(name);
        this.doors = doors;
        this.engineSize = engineSize;
    }
}
