package us.rlit.control.flow;

import java.util.Scanner;

public class UserInputImproved {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Check negative years
        System.out.println("Enter your year of birth: ");
        // Check type for type errors
        boolean hasNextInt = scanner.hasNextInt();

        if( hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();


            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", your age is " + age);

            } else {
                System.out.println("Hey " + name + " Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();

    }
}
