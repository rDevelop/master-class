package us.rlit.oop.challenges.encapsulate;

public class Office {
    public static void main(String[] args) {

        Printer p = new Printer(40, false);
        p.fillToner(10);
        p.getTonerLevel();

        p.fillToner(30);
        p.getTonerLevel();
        p.fillToner(60);
        p.getTonerLevel();

        p.print(50);
        p.print(10);
        p.print(1000);
    }
}
