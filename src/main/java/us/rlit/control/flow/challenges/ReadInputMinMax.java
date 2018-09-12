package us.rlit.control.flow.challenges;

import java.util.Scanner;

public class ReadInputMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int input;
        boolean first = true;
        while(true) {
            System.out.println("Enter number:");
            if(scanner.hasNextInt()) {
                input = scanner.nextInt();

                if(first) {
                    min = input;
                    max = input;
                    first = false;
                }
                if(input > max) {
                    max = input;
                }
                if( input < min){
                    min = input;
                }
                scanner.nextLine();
            } else {
                break;
            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
