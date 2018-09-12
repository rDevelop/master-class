package us.rlit.control.flow;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        int age = 2018 - yearOfBirth;
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + ", your age is " + age);

        System.out.println("School ?");
        String school = scanner.nextLine();
        System.out.println("School is "+ school);
        scanner.close();

    }
}
