package us.rlit.oop.classes;

public class Car {
    // encapsulation
    //private int encapsule;

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append("doors: "  + doors + " ");
        b.append("wheels: "  + wheels + " ");
        b.append("model: " + model + " ");
        b.append("engine: " + engine + " ");
        b.append("color: " + color + " ");
        return b.toString();
    }
}
