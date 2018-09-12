package us.rlit.oop.enheritance;

public class Vet {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5 , 4);
        Dog dog = new Dog("Yorkie",30  , 1, 2, 40, 2, 4, 1, 20, "White");



        animal.eat();
        animal.move(4);

        dog.eat();
        dog.walk();
        dog.run();
        dog.chew();




    }
}
