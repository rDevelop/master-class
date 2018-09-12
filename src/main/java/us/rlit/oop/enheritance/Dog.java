package us.rlit.oop.enheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        // Satisfy Animal needs
        super(name, brain, body, size, weight);
        // Continue creating dog.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("Chewing bones");
        eat();
    }

    public void walk() {
        System.out.println("Dog walks");
        super.move(1);
    }

    @Override
    public void eat(){
        System.out.println("dog eat");
        super.eat();
    }

    public void run() {
        System.out.println("Dog running");
        move(10);
    }



//    @Override
//    public void move(int speed) {
//        System.out.println("dog move");
//        super.move(speed);
//    }





}
