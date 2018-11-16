package us.rlit.innerclasses.nonstatic.nested;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


        /*
        Current Gear
         */
        // Private Gear in Gearbox - hidden
//        GearBox mcLaren = new GearBox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
//        mcLaren.operateClutch(true);
//        System.out.println(mcLaren.wheelSpeed(8000));


        /*
        Original Gear
        */
        // Public Gear in GearBox - exposed
        //GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        // Nope.. GearBox is not an enclosing class.
        //GearBox.Gear second = new GearBox.Gear(2, 14.9);
        // Nope... Can'T resolve symbol Gear
        //GearBox.Gear third = new mcLaren.Gear(3, 16.5);
        //System.out.println(first.driveSpeed(100));


        /*
        Using button click
         */

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



        /*
        Anonymous class is a local class without name
        Need to be initiated
         */



}
