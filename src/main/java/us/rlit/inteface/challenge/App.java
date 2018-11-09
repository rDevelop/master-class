package us.rlit.inteface.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        saveData(new SkunkSaver());
        saveData(new SuperSaver());
    }

    public static void saveData(Saver saver) {
        System.out.println("Populate data for " + saver.getClass().getSimpleName());
        saver.populate(readValues());
        saver.save();
        System.out.println(saver);
    }


    public static List<String> readValues() {
        List<String> data = new ArrayList();
        boolean running = true;
        Scanner s = new Scanner(System.in);
        System.out.println("1: Enter Value:");
        System.out.println("0: Quit");
        while (running) {
            int choice = s.nextInt();
            switch (choice) {
                case 0:
                    running = false;
                    break;
                case 1:
                    System.out.println("Enter value: ");
                    s.nextLine();
                    String input = s.nextLine();
                    System.out.println("Entered " + input);
                    data.add(input);
                    break;
            }


        }
        return data;
    }
}
