package us.rlit.oop.staticinstance;

class InstanceVariables {

    public static void main(String[] args) {
        DogInstance rex = new DogInstance("rex");
        DogInstance cruzer = new DogInstance("cruzer");

        rex.printName();
        cruzer.printName();


    }
}


class DogInstance {
    /**
     * Instance name in DogInstance has its own state of this var
     */
    private String name;

    public DogInstance(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name " + name);
    }
}
