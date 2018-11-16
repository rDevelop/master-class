package us.rlit.innerclasses.nonstatic.nested;

import java.util.Scanner;

public class AnonymousClass {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        /*
        Anonymous class is a local class without name
        Need to be initiated within brackets
         */
        btnPrint.setOnClockListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();



    }

        private static void listen() {
            boolean quit = false;
            while(!quit) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();
                }
            }
        }







}
