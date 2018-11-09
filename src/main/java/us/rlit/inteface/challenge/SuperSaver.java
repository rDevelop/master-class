package us.rlit.inteface.challenge;

import java.util.ArrayList;
import java.util.List;

public class SuperSaver implements Saver {
    private List<String> medium;
    private final String NAME = "SkunkSaver";

    public SuperSaver() {
        medium = new ArrayList<>();
    }
    @Override
    public void save() {
        if(medium.size() > 0) {
            medium.forEach(s -> System.out.println("Saving "  + s));
        }

    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public void populate(List<String> data) {
        medium.add("STINKY DATA");
        medium.addAll(data);
    }

    @Override
    public String toString() {
        return "SuperSaver{" +
                "medium=" + medium +
                '}';
    }
}
