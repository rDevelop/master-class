package us.rlit.expressions;


/**
 *
 *
 *
 */
public class Overloading {

    public static void main(String[] args) {
        holla();
        holla("rob");
        holla("robert", 4);

    }

    public static void holla() {
        System.out.println("Holla");;
    }

    public static void holla(String holla) {
        System.out.println("Holla "+ holla);
    }

    public static void holla(String holla, int times) {
        for (int i=0; i<times; i++) {
            System.out.println("Holla " + holla);
        }
    }
}
