package us.rlit.oop.composition.stricter;

public class AComposition {


    /**
     *
     *      A PC HAS-A monitor, Motherboard, and a Case
     *
     */


    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 , 5);
        Case theCase = new Case("220", "AC", "240", dimensions);

        Monitor monitor = new Monitor("59X", "Samsung", 59,new Resolution(3800, 2400));

        MotherBoard motherBoard = new MotherBoard("OX", "Apple", 32, 8);

        PC pc = new PC(theCase, monitor, motherBoard);
        pc.powerUp();
    }
}
