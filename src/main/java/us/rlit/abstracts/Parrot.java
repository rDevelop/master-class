package us.rlit.abstracts;

/**
 * Created by rob on 11/28/2018.
 */
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
