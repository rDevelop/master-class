package us.rlit.methods;

public class Main {

    public static void main(String[] args) {
        System.out.println("HERE WE ARE IN MAIN");
        staticMethod();
        Dog dog = new Dog();
    }

    public static void staticMethod() {
        System.out.println("In static method");
    }

    public void instanceMethod() {
        System.out.println("instance metheod");
        instanceMethod();
    }

}

class Dog {

    static void staticDog() {
        System.out.println("In Static Dog");
        //dogger();
    }

    void dogger() {
        System.out.println("In instance dogger");
    }

    Dog() {
        Main.staticMethod();
        staticDog();
        dogger();
    }
}