package us.rlit.abstracts;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Bulldog");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Red One");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
