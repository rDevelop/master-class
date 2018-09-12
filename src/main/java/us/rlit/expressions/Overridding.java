package us.rlit.expressions;


import java.nio.charset.MalformedInputException;

/**
 *
 * Runtime polymorphism
 * dynamic method dispatch
 *
 *
 */


public class Overridding extends Moon {
    public static void main(String[] args) {
        new Overridding().go();
    }

    public void go() {
        glow();
        super.glow();
        try {
            move();
        }catch (MalformedInputException e) {
            System.out.println(e.toString());
        }
        try {
            super.move();
        } catch(Exception e) {
            System.out.println(e.toString());
        }

        new MilkyWay().getMoon();
        new SolarSystem().getMoon();


    }

    @Override
    public void glow() {
        System.out.println("Overriding glowing");
    }

//    @Override
//    public void move() throws Exception {
//        System.out.println("Overriding move");
//    }

    @Override
    public void move() throws MalformedInputException {
        System.out.println("Runtime exception");
    }



}

class Bigmoon extends Moon {
    public Bigmoon() {
        System.out.println("BigMoon constructor");
    }

}

class Moon {
    public Moon() {
        System.out.println("Moon constructor");
    }
    public void glow() {
        System.out.println("Moon glowing");
    }

    public void move() throws Exception {
        System.out.println("Moon move");
    }

}

class SolarSystem {
    public Moon getMoon() {
        return new Moon();
    }
}

/**
 *
 * Covariant return type Moon & BigMoon
 */

class MilkyWay extends SolarSystem {
    @Override
    public Bigmoon getMoon() {
        return new Bigmoon();
    }

}
