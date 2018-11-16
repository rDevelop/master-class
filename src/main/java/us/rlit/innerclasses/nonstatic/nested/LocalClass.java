package us.rlit.innerclasses.nonstatic.nested;

import java.util.Scanner;

public class LocalClass {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


        // Local class in method
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I'm attached in constructer");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }

        }

        btnPrint.setOnClockListener(new ClickListener());
        listen();

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
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



        /*
        Anonymous class is a local class without name
        Need to be initiated
         */


}
