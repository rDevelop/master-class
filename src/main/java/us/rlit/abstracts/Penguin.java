package us.rlit.abstracts;

/**
 * Created by rob on 11/28/2018.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
