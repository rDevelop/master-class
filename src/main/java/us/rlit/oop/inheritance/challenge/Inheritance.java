package us.rlit.oop.inheritance.challenge;

public class Inheritance {

    public static void main(String[] args) {
        RangeRover ss  = new RangeRover(100, "right", "black");
        ss.petalToTheMetal();
    }

}

class Vehicle {
    private int speed;
    private String direction;
    int gear;

    public Vehicle(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
        this.gear = 1;
    }

    public void moving(int speed) {
        this.speed = speed;
        System.out.println("Moving " + speed);
        if (speed < 10) {
            this.gear = 1;
        } else if (gear < 20) {
            this.gear = 2;
        } else {
            gear = 3;
        }
        System.out.println("Gear " + gear);
    }
    public void steering(String direction) {
        this.direction = direction;
        System.out.println("Going " + direction);
    }
}

class Car extends Vehicle {
    private int speed;
    private String make;
    private String model;
    private String color;

    public Car(int speed, String direction, String make, String model, String color) {
        super(speed, direction);
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car's gear change to " + gear);
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed is now "+ speed);
        super.moving(speed);
    }
}


class RangeRover extends Car {
    public RangeRover(int speed, String direction, String color) {
        super(speed, direction, "RangeRover", "SS", color);
    }

    public void petalToTheMetal() {
        changeSpeed(100);
        moving(100);
        steering("Straight");
    }

}