package us.rlit.oop.staticinstance;

public class StaticVariables {

    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog cruzer = new Dog("cruzer");

        /*
        name is static, so its shared within class
        and the last change effects all names;
         */

        rex.printName();
        cruzer.printName();


    }
}

class Dog {
    /**
     * This static var is always going to be assigned to the class.
     */
    private static String name;
    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("Name " + name);
    }
}