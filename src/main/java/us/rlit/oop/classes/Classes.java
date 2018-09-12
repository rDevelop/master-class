package us.rlit.oop.classes;

public class Classes {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println(porsche);
        System.out.println(holden);
    }
}
